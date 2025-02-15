package org.myrobotlab.kinematics;

import java.util.Map;

/**
 * An Action is a part of a sequence of actions which can be executed by the
 * ServoMixer. An action can have different types, such as moveTo, speak, sleep,
 * and process. This gives each gesture the ability to be scripted with multiple
 * actions.
 * 
 * @author GroG
 *
 */
public class Action {
  // consider enum type
  enum Type {
    moveTo, speak, sleep, process
  }

  /**
   * type determines how to handle the value depending on what is desired ...
   */
  public String type = "moveTo"; // moveTo | speak | sleep | Message

  /**
   * delay type when type is Delay, String when type is Text
   */
  public Object value;

  /**
   * blocks if true - and will wait for this action to complete before going to
   * the next action
   */
  public boolean willBlock = true;

  @Override
  public String toString() {
    return String.format("part %s %s", type, (value != null) ? value.toString() : null);
  }

  public static Action createMoveToAction(Map<String, Map<String, Object>> moves) {
    Action action = new Action();
    action.type = "moveTo";
    action.value = moves;
    return action;
  }

  public static Action createSleepAction(double sleep) {
    Action action = new Action();
    action.type = "sleep";
    action.value = sleep;
    return action;
  }

  public static Action createSpeakAction(Map<String, Object> speechCommand) {
    Action action = new Action();
    action.type = "speak";
    action.value = speechCommand;
    return action;
  }

  public static Action createGestureToAction(String gestureName) {
    Action action = new Action();
    action.type = "gesture";
    action.value = gestureName;
    return action;
  }

  public static Action createProcessingAction(String methodName) {
    Action action = new Action();
    action.type = "process";
    action.value = methodName;
    return action;
  }
}
