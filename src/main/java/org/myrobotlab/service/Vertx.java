package org.myrobotlab.service;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.myrobotlab.codec.CodecUtils;
import org.myrobotlab.framework.Message;
import org.myrobotlab.framework.Service;
import org.myrobotlab.logging.Level;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.logging.LoggingFactory;
import org.myrobotlab.net.Connection;
import org.myrobotlab.service.config.VertxConfig;
import org.myrobotlab.service.interfaces.Gateway;
import org.myrobotlab.vertx.ApiVerticle;
import org.slf4j.Logger;

import io.vertx.core.VertxOptions;
import io.vertx.core.http.ServerWebSocket;

/**
 * Vertx gateway - used to support a http and websocket gateway for myrobotlab.
 * Write business logic in Verticles. Also, try not to write any logic besides initialization inside start() method.
 * 
 * It currently does not utilize the Vertx event bus - which is pretty much the most important part of Vertx.
 * TODO: take advantage of publishing on the event bus
 * 
 * <a href="https://medium.com/@pvub/https-medium-com-pvub-vert-x-workers-6a8df9b2b9ee">vertx worker</a>
 * 
 * @author GroG
 *
 */
public class Vertx extends Service<VertxConfig> implements Gateway {

  private static final long serialVersionUID = 1L;

  private transient io.vertx.core.Vertx vertx = null;

  public final static Logger log = LoggerFactory.getLogger(Vertx.class);

  public Vertx(String n, String id) {
    super(n, id);
  }

  /**
   * deploys a http and websocket verticle on a secure TLS channel with self signed certificate
   */
  public void start() {
    log.info("starting driver");

    /**
     * FIXME - might have to revisit this This is a block comment, but takes
     * advantage of javadoc pre non-formatting in ide to preserve the code
     * formatting
     * 
     * <pre>
     * 
     * final Vertx that = this;
     * 
     * java.lang.Runtime.getRuntime().addShutdownHook(new Thread() {
     *   public void run() {
     *     System.out.println("Running Shutdown Hook");
     *     that.stop();
     *   }
     * });
     * 
     * </pre>
     */

    vertx = io.vertx.core.Vertx.vertx(new VertxOptions().setBlockedThreadCheckInterval(100000));
    vertx.deployVerticle(new ApiVerticle(this));

  }
  
  @Override
  public void startService() {
    super.startService();
    start();
  }
  
  @Override
  public void stopService() {
    super.stopService();
    stop();
  }

  /**
   * Undeploy the verticle serving http and ws
   */
  public void stop() {
    log.info("stopping driver");
    Set<String> ids = vertx.deploymentIDs();
    for (String id : ids) {
      vertx.undeploy(id, (result) -> {
        if (result.succeeded()) {
          log.info("undeploy succeeded");
        } else {
          log.error("undeploy failed");
        }
      });
    }
  }

  public static void main(String[] args) {
    try {

      LoggingFactory.init(Level.INFO);

      Vertx vertx = (Vertx) Runtime.start("vertx", "Vertx");
      vertx.start();

       InMoov2 i01 = (InMoov2)Runtime.start("i01", "InMoov2");
       // i01.startSimulator();
       JMonkeyEngine jme = (JMonkeyEngine)i01.startPeer("simulator");
//       Runtime.start("python", "Python");
//      
       WebGui webgui = (WebGui) Runtime.create("webgui", "WebGui");
       // webgui.setSsl(true);
       webgui.autoStartBrowser(false);
       webgui.setPort(8888);
       webgui.startService();

    } catch (Exception e) {
      log.error("main threw", e);
    }
  }

  // FIXME - refactor for bare minimum
  
  @Override /* FIXME "Gateway" is server/service oriented not connecting thing - remove this */
  public void connect(String uri) throws URISyntaxException {
    // TODO Auto-generated method stub

  }
  
  @Override /* FIXME not much point of these - as they are all consistently using Runtime's centralized connection info */
  public List<String> getClientIds() {
    return Runtime.getInstance().getConnectionUuids(getName());
  }

  @Override /* FIXME not much point of these - as they are all consistently using Runtime's centralized connection info */
  public Map<String, Connection> getClients() {
    return Runtime.getInstance().getConnections(getName());
  }


  @Override /* FIXME this is the one and probably "only" relevant method for Gateway - perhaps a handle(Connection c) */
  public void sendRemote(Message msg) throws Exception {
    log.info("sendRemote {}", msg.toString());
    // FIXME MUST BE DIRECT THREAD FROM BROADCAST NOT OUTBOX !!!
    msg.addHop(getId());
    Map<String, Connection> clients = getClients();
    for(Connection c: clients.values()) {
      try {
      ServerWebSocket socket = (ServerWebSocket)c.get("websocket");
      String json = CodecUtils.toJsonMsg(msg);
      socket.writeTextMessage(json);
      } catch(Exception e) {
        error(e);
      }
    }
    // broadcastMode - iterate through clients send all
  }

  @Override
  public boolean isLocal(Message msg) {
    return Runtime.getInstance().isLocal(msg);  }
  
  public io.vertx.core.Vertx getVertx() {
    return vertx;
  }
}
