package org.myrobotlab.vertx;

import java.lang.reflect.Method;

import org.myrobotlab.codec.CodecUtils;
import org.myrobotlab.framework.MethodCache;
import org.myrobotlab.framework.interfaces.ServiceInterface;
import org.myrobotlab.service.Runtime;
import org.myrobotlab.service.config.VertxConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.SelfSignedCertificate;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.CorsHandler;
import io.vertx.ext.web.handler.StaticHandler;

/**
 * verticle to handle api requests
 * 
 * @author GroG
 */
public class ApiVerticle extends AbstractVerticle {

  public final static Logger log = LoggerFactory.getLogger(ApiVerticle.class);

  private Router router;

  transient private org.myrobotlab.service.Vertx service;

  public ApiVerticle(org.myrobotlab.service.Vertx service) {
    super();
    this.service = service;
  }

  @Override
  public void start() throws Exception {
    // process configuration and create handlers
    log.info("starting api verticle");
    VertxConfig config = (VertxConfig) service.getConfig();

    // create a router
    router = Router.router(vertx);

    // handle cors requests
    router.route().handler(CorsHandler.create("*").allowedMethod(HttpMethod.GET).allowedMethod(HttpMethod.OPTIONS).allowedHeader("Accept").allowedHeader("Authorization")
        .allowedHeader("Content-Type"));

    // static file routing
    router.route("/*").handler(StaticHandler.create("src/main/resources/resource/Vertx/app"));
    router.route("/static/*").handler(StaticHandler.create("webroot"));

    // router.get("/health").handler(this::generateHealth);
    // router.get("/api/transaction/:customer/:tid").handler(this::handleTransaction);

    // create the HTTP server and pass the
    // "accept" method to the request handler
    HttpServerOptions httpOptions = new HttpServerOptions();

    if (config.ssl) {
      SelfSignedCertificate certificate = SelfSignedCertificate.create();
      httpOptions.setSsl(true);
      httpOptions.setKeyCertOptions(certificate.keyCertOptions());
      httpOptions.setTrustOptions(certificate.trustOptions());
    }
    httpOptions.setPort(config.port);

    HttpServer server = vertx.createHttpServer(httpOptions);
    // TODO - this is where multiple workers would be defined
    // .createHttpServer()

    // FIXME - don't do "long" or "common" processing in the start()
    // FIXME - how to do this -> server.webSocketHandler(this::handleWebSocket);
    server.webSocketHandler((ctx) -> {
      // ctx.writeTextMessage("ping"); FIXME - query ?
      ctx.textMessageHandler((json) -> {
        log.info("handling {}", json);

        Method method;
        try {

          org.myrobotlab.framework.Message msg = CodecUtils.fromJson(json, org.myrobotlab.framework.Message.class);

          Class<?> clazz = Runtime.getClass(msg.name);
          if (clazz == null) {
            log.error("cannot derive local type from service {}", msg.name);
            return;
          }

          MethodCache cache = MethodCache.getInstance();
          Object[] params = cache.getDecodedJsonParameters(clazz, msg.method, msg.data);

          method = cache.getMethod(clazz, msg.method, params);
          if (method == null) {
            service.error("method cache could not find %s.%s(%s)", clazz.getSimpleName(), msg.method, msg.data);
            return;
          }

          ServiceInterface si = Runtime.getService(msg.name);
          Object ret = method.invoke(si, params);

          // put msg on mrl msg bus :)
          // service.in(msg); <- NOT DECODE PARAMS !!

          // if ((new Random()).nextInt(100) == 0) {
          // ctx.close(); - will close the websocket !!!
          // } else {
          // ctx.writeTextMessage("ping"); Useful is writing back
          // }

        } catch (Exception e) {
          service.error(e);
        }
      });
    });

    server.requestHandler(router);
    // start servers
    server.listen();
  }

  @Override
  public void stop() throws Exception {
    log.info("stopping api verticle");
  }

}
