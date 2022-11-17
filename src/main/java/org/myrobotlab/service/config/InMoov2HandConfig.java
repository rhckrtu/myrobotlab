package org.myrobotlab.service.config;

import org.myrobotlab.framework.Plan;

public class InMoov2HandConfig extends ServiceConfig {

  // peer names
  public String thumb;
  public String index;
  public String majeure;
  public String ringFinger;
  public String pinky;
  public String wrist;

  @Override
  public Plan getDefault(Plan plan, String name) {
    super.getDefault(plan, name);

    // default peer names
    thumb = name + ".thumb";
    index = name + ".index";
    majeure = name + ".majeure";
    ringFinger = name + ".ringFinger";
    pinky = name + ".pinky";
    wrist = name + ".wrist";

    addPeer(plan, name, "thumb", thumb, "Servo", "Thumb servo");
    addPeer(plan, name, "index", index, "Servo", "Index servo");
    addPeer(plan, name, "majeure", majeure, "Servo", "Majeure servo");
    addPeer(plan, name, "ringFinger", ringFinger, "Servo", "RingFinger servo");
    addPeer(plan, name, "pinky", pinky, "Servo", "Pinky servo");
    addPeer(plan, name, "wrist", wrist, "Servo", "Wrist servo");

    // FIXME - do this with reflection in addPeer
    thumb = name + ".thumb";
    index = name + ".index";
    majeure = name + ".majeure";
    ringFinger = name + ".ringFinger";
    pinky = name + ".pinky";
    wrist = name + ".wrist";

    String cname = null;

    if (name.endsWith("leftHand")) {
      cname = "i01.left"; // FIXME - still terrible to have a i01 here :(
    } else if (name.endsWith("rightHand")) {
      cname = "i01.right"; // FIXME - still terrible to have a i01 here :(
    }

    // build a config with all peer defaults

    ServoConfig thumb = (ServoConfig) plan.get(this.thumb);
    thumb.autoDisable = true;
    thumb.controller = cname;
    thumb.clip = true;
    thumb.idleTimeout = 3000;
    thumb.inverted = false;
    thumb.maxIn = 180.0;
    thumb.maxOut = 180.0;
    thumb.minIn = 0.0;
    thumb.minOut = 0.0;
    thumb.pin = "2";
    thumb.rest = 0.0;
    thumb.speed = 45.0;
    thumb.sweepMax = null;
    thumb.sweepMin = null;

    ServoConfig index = (ServoConfig) plan.get(this.index);
    index.autoDisable = true;
    index.controller = cname;
    index.clip = true;
    index.idleTimeout = 3000;
    index.inverted = false;
    index.maxIn = 180.0;
    index.maxOut = 180.0;
    index.minIn = 0.0;
    index.minOut = 0.0;
    index.pin = "3";
    index.rest = 0.0;
    index.speed = 45.0;
    index.sweepMax = null;
    index.sweepMin = null;

    ServoConfig majeure = (ServoConfig) plan.get(this.majeure);
    majeure.autoDisable = true;
    majeure.controller = cname;
    majeure.clip = true;
    majeure.idleTimeout = 3000;
    majeure.inverted = false;
    majeure.maxIn = 180.0;
    majeure.maxOut = 180.0;
    majeure.minIn = 0.0;
    majeure.minOut = 0.0;
    majeure.pin = "4";
    majeure.rest = 0.0;
    majeure.speed = 45.0;
    majeure.sweepMax = null;
    majeure.sweepMin = null;

    ServoConfig ringFinger = (ServoConfig) plan.get(this.ringFinger);
    ringFinger.autoDisable = true;
    ringFinger.controller = cname;
    ringFinger.clip = true;
    ringFinger.idleTimeout = 3000;
    ringFinger.inverted = false;
    ringFinger.maxIn = 180.0;
    ringFinger.maxOut = 180.0;
    ringFinger.minIn = 0.0;
    ringFinger.minOut = 0.0;
    ringFinger.pin = "5";
    ringFinger.rest = 0.0;
    ringFinger.speed = 45.0;
    ringFinger.sweepMax = null;
    ringFinger.sweepMin = null;

    ServoConfig pinky = (ServoConfig) plan.get(this.pinky);
    pinky.autoDisable = true;
    pinky.controller = cname;
    pinky.clip = true;
    pinky.idleTimeout = 3000;
    pinky.inverted = false;
    pinky.maxIn = 180.0;
    pinky.maxOut = 180.0;
    pinky.minIn = 0.0;
    pinky.minOut = 0.0;
    pinky.pin = "6";
    pinky.rest = 0.0;
    pinky.speed = 45.0;
    pinky.sweepMax = null;
    pinky.sweepMin = null;

    ServoConfig wrist = (ServoConfig) plan.get(this.wrist);
    wrist.autoDisable = true;
    wrist.controller = cname;
    wrist.clip = true;
    wrist.idleTimeout = 3000;
    wrist.inverted = false;
    wrist.maxIn = 180.0;
    wrist.maxOut = 180.0;
    wrist.minIn = 0.0;
    wrist.minOut = 0.0;
    wrist.pin = "7";
    wrist.rest = 0.0;
    wrist.speed = 45.0;
    wrist.sweepMax = null;
    wrist.sweepMin = null;

    return plan;

  }

}