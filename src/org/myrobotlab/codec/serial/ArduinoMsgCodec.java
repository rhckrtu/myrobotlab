package org.myrobotlab.codec.serial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import org.myrobotlab.logging.Level;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.logging.Logging;
import org.myrobotlab.logging.LoggingFactory;
import org.myrobotlab.service.Arduino;
import org.myrobotlab.service.Runtime;
import org.myrobotlab.service.Serial;
import org.myrobotlab.service.interfaces.LoggingSink;
import org.python.netty.handler.codec.CodecException;
import org.slf4j.Logger;

// FIXME - use InputStream OutputStream 
// Stream encoders are more complicated than Document 
// with InputStream decoding - you need to deal with blocking / timeouts etc
// if the thing before it deals with it then you have a byte array - but it may not be complete

/**
 * This file is generated by running ArduinoBindingsGenerator
 * the template which is used is in /src/resource/generate/ArduinoMsgCodec.txt
 * If there are modifications directly to this file - it is likely they will be overwritten.
 *
 * Codec to interface with the Arduino service and MRLComm.ino part of this file
 * is dynamically generated from the method signatures of the Arduino service
 * 
 * MAGIC_NUMBER|NUM_BYTES|FUNCTION|DATA0|DATA1|....|DATA(N) NUM_BYTES - is the
 * number of bytes after NUM_BYTES to the end
 * 
 * @author GroG
 *
 */
public class ArduinoMsgCodec extends Codec implements Serializable {

  public ArduinoMsgCodec() {
    super(null);
  }

  public ArduinoMsgCodec(LoggingSink sink) {
    super(sink);
  }

  private static final long serialVersionUID = 1L;

  public final static Logger log = LoggerFactory.getLogger(ArduinoMsgCodec.class);

  transient static final HashMap<Integer, String> byteToMethod = new HashMap<Integer, String>();
  transient static final HashMap<String, Integer> methodToByte = new HashMap<String, Integer>();
  int byteCount = 0;
  int decodeMsgSize = 0;
  StringBuilder rest = new StringBuilder();

  public static final int MAX_MSG_SIZE = 64;
  public static final int MAGIC_NUMBER = 170; // 10101010
  public static final int MRLCOMM_VERSION = 37;
  
  // ------  device type mapping constants
  
 	public static final int DEVICE_TYPE_NOT_FOUND = 0;
 	
	public static final int DEVICE_TYPE_ARDUINO = 1;
	public static final int DEVICE_TYPE_ULTRASONIC = 4;
	public static final int DEVICE_TYPE_STEPPER = 5;
	public static final int DEVICE_TYPE_MOTOR = 6;
	public static final int DEVICE_TYPE_SERVO = 7;
	public static final int DEVICE_TYPE_I2C = 8;
	public static final int DEVICE_TYPE_NEOPIXEL = 9;
  
  // ----------- event types -------------------
  public static final int STEPPER_EVENT_STOP = 1;
  public static final int STEPPER_EVENT_STEP = 2;
  
  // -------- byteToMethod begin --------------------
  /*
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.MAX_MSG_SIZE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.MAGIC_NUMBER;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.MRLCOMM_VERSION;

	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_NOT_FOUND;
	
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_ARDUINO;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_ULTRASONIC;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_STEPPER;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_MOTOR;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_STEPPER;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_MOTOR;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_SERVO;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_I2C;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_TYPE_NEOPIXEL;
	

  	///// java static import definition - DO NOT MODIFY - Begin //////
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_MRLCOMM_ERROR;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.GET_VERSION;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_VERSION;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.ANALOG_WRITE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.CREATE_I2C_DEVICE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_ATTACH;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DEVICE_DETACH;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DIGITAL_WRITE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DISABLE_BOARD_STATUS;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.DISABLE_PIN;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.ENABLE_BOARD_STATUS;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.ENABLE_PIN;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.GET_MRL_PIN_TYPE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.I2C_READ;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.I2C_WRITE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.I2C_WRITE_READ;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.INTS_TO_STRING;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.IS_ATTACHED;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.MOTOR_MOVE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.MOTOR_MOVE_TO;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.MOTOR_RESET;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.MOTOR_STOP;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.NEO_PIXEL_WRITE_MATRIX;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.ON_SENSOR_DATA;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PIN_MODE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_ATTACHED_DEVICE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_BOARD_INFO;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_BOARD_STATUS;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_DEBUG;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_MESSAGE_ACK;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_PIN;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_PIN_ARRAY;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_PULSE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_PULSE_STOP;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_SENSOR_DATA;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_SERVO_EVENT;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PUBLISH_TRIGGER;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PULSE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.PULSE_STOP;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.READ;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.RELEASE_I2C_DEVICE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SENSOR_ACTIVATE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SENSOR_DEACTIVATE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SENSOR_POLLING_START;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SENSOR_POLLING_STOP;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_ATTACH;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_DETACH;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_EVENTS_ENABLED;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_SET_SPEED;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_SWEEP_START;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_SWEEP_STOP;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_WRITE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SERVO_WRITE_MICROSECONDS;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SET_DEBOUNCE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SET_DEBUG;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SET_DIGITAL_TRIGGER_ONLY;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SET_PWMFREQUENCY;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SET_SAMPLE_RATE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SET_SERIAL_RATE;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SET_TRIGGER;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.SOFT_RESET;
	import static org.myrobotlab.codec.serial.ArduinoMsgCodec.WRITE;

  */
  
  	///// java ByteToMethod generated definition - DO NOT MODIFY - Begin //////
	// {publishMRLCommError Integer} 
	public final static int PUBLISH_MRLCOMM_ERROR =		1;

	// {getVersion} 
	public final static int GET_VERSION =		2;

	// {publishVersion Integer} 
	public final static int PUBLISH_VERSION =		3;

	// {analogWrite int int} 
	public final static int ANALOG_WRITE =		4;

	// {createI2cDevice I2CControl int int} 
	public final static int CREATE_I2C_DEVICE =		5;

	// {deviceAttach DeviceControl Object[]} 
	public final static int DEVICE_ATTACH =		6;

	// {deviceDetach DeviceControl} 
	public final static int DEVICE_DETACH =		7;

	// {digitalWrite int int} 
	public final static int DIGITAL_WRITE =		8;

	// {disableBoardStatus} 
	public final static int DISABLE_BOARD_STATUS =		9;

	// {disablePin int} 
	public final static int DISABLE_PIN =		10;

	// {enableBoardStatus int} 
	public final static int ENABLE_BOARD_STATUS =		11;

	// {enablePin int} 
	public final static int ENABLE_PIN =		12;

	// {getMrlPinType PinDefinition} 
	public final static int GET_MRL_PIN_TYPE =		13;

	// {i2cRead I2CControl int int byte[] int} 
	public final static int I2C_READ =		14;

	// {i2cWrite I2CControl int int byte[] int} 
	public final static int I2C_WRITE =		15;

	// {i2cWriteRead I2CControl int int byte[] int byte[] int} 
	public final static int I2C_WRITE_READ =		16;

	// {intsToString int[] int int} 
	public final static int INTS_TO_STRING =		17;

	// {isAttached} 
	public final static int IS_ATTACHED =		18;

	// {motorMove MotorControl} 
	public final static int MOTOR_MOVE =		19;

	// {motorMoveTo MotorControl} 
	public final static int MOTOR_MOVE_TO =		20;

	// {motorReset MotorControl} 
	public final static int MOTOR_RESET =		21;

	// {motorStop MotorControl} 
	public final static int MOTOR_STOP =		22;

	// {neoPixelWriteMatrix NeoPixel List} 
	public final static int NEO_PIXEL_WRITE_MATRIX =		23;

	// {onSensorData SensorData} 
	public final static int ON_SENSOR_DATA =		24;

	// {pinMode String String} 
	public final static int PIN_MODE =		25;

	// {publishAttachedDevice String} 
	public final static int PUBLISH_ATTACHED_DEVICE =		26;

	// {publishBoardInfo BoardInfo} 
	public final static int PUBLISH_BOARD_INFO =		27;

	// {publishBoardStatus BoardStatus} 
	public final static int PUBLISH_BOARD_STATUS =		28;

	// {publishDebug String} 
	public final static int PUBLISH_DEBUG =		29;

	// {publishMessageAck} 
	public final static int PUBLISH_MESSAGE_ACK =		30;

	// {publishPin PinData} 
	public final static int PUBLISH_PIN =		31;

	// {publishPinArray PinData[]} 
	public final static int PUBLISH_PIN_ARRAY =		32;

	// {publishPulse Long} 
	public final static int PUBLISH_PULSE =		33;

	// {publishPulseStop Integer} 
	public final static int PUBLISH_PULSE_STOP =		34;

	// {publishSensorData SensorData} 
	public final static int PUBLISH_SENSOR_DATA =		35;

	// {publishServoEvent Integer} 
	public final static int PUBLISH_SERVO_EVENT =		36;

	// {publishTrigger Pin} 
	public final static int PUBLISH_TRIGGER =		37;

	// {pulse int int int int} 
	public final static int PULSE =		38;

	// {pulseStop} 
	public final static int PULSE_STOP =		39;

	// {read String} 
	public final static int READ =		40;

	// {releaseI2cDevice I2CControl int int} 
	public final static int RELEASE_I2C_DEVICE =		41;

	// {sensorActivate SensorControl Object[]} 
	public final static int SENSOR_ACTIVATE =		42;

	// {sensorDeactivate SensorControl} 
	public final static int SENSOR_DEACTIVATE =		43;

	// {sensorPollingStart String} 
	public final static int SENSOR_POLLING_START =		44;

	// {sensorPollingStop String} 
	public final static int SENSOR_POLLING_STOP =		45;

	// {servoAttach ServoControl int} 
	public final static int SERVO_ATTACH =		46;

	// {servoDetach ServoControl} 
	public final static int SERVO_DETACH =		47;

	// {servoEventsEnabled ServoControl boolean} 
	public final static int SERVO_EVENTS_ENABLED =		48;

	// {servoSetSpeed ServoControl} 
	public final static int SERVO_SET_SPEED =		49;

	// {servoSweepStart ServoControl} 
	public final static int SERVO_SWEEP_START =		50;

	// {servoSweepStop ServoControl} 
	public final static int SERVO_SWEEP_STOP =		51;

	// {servoWrite ServoControl} 
	public final static int SERVO_WRITE =		52;

	// {servoWriteMicroseconds ServoControl int} 
	public final static int SERVO_WRITE_MICROSECONDS =		53;

	// {setDebounce int} 
	public final static int SET_DEBOUNCE =		54;

	// {setDebug boolean} 
	public final static int SET_DEBUG =		55;

	// {setDigitalTriggerOnly Boolean} 
	public final static int SET_DIGITAL_TRIGGER_ONLY =		56;

	// {setPWMFrequency Integer Integer} 
	public final static int SET_PWMFREQUENCY =		57;

	// {setSampleRate int} 
	public final static int SET_SAMPLE_RATE =		58;

	// {setSerialRate int} 
	public final static int SET_SERIAL_RATE =		59;

	// {setTrigger int int int} 
	public final static int SET_TRIGGER =		60;

	// {softReset} 
	public final static int SOFT_RESET =		61;

	// {write int int} 
	public final static int WRITE =		62;


  static {
  		byteToMethod.put(PUBLISH_MRLCOMM_ERROR,"publishMRLCommError");
		methodToByte.put("publishMRLCommError",PUBLISH_MRLCOMM_ERROR);

		byteToMethod.put(GET_VERSION,"getVersion");
		methodToByte.put("getVersion",GET_VERSION);

		byteToMethod.put(PUBLISH_VERSION,"publishVersion");
		methodToByte.put("publishVersion",PUBLISH_VERSION);

		byteToMethod.put(ANALOG_WRITE,"analogWrite");
		methodToByte.put("analogWrite",ANALOG_WRITE);

		byteToMethod.put(CREATE_I2C_DEVICE,"createI2cDevice");
		methodToByte.put("createI2cDevice",CREATE_I2C_DEVICE);

		byteToMethod.put(DEVICE_ATTACH,"deviceAttach");
		methodToByte.put("deviceAttach",DEVICE_ATTACH);

		byteToMethod.put(DEVICE_DETACH,"deviceDetach");
		methodToByte.put("deviceDetach",DEVICE_DETACH);

		byteToMethod.put(DIGITAL_WRITE,"digitalWrite");
		methodToByte.put("digitalWrite",DIGITAL_WRITE);

		byteToMethod.put(DISABLE_BOARD_STATUS,"disableBoardStatus");
		methodToByte.put("disableBoardStatus",DISABLE_BOARD_STATUS);

		byteToMethod.put(DISABLE_PIN,"disablePin");
		methodToByte.put("disablePin",DISABLE_PIN);

		byteToMethod.put(ENABLE_BOARD_STATUS,"enableBoardStatus");
		methodToByte.put("enableBoardStatus",ENABLE_BOARD_STATUS);

		byteToMethod.put(ENABLE_PIN,"enablePin");
		methodToByte.put("enablePin",ENABLE_PIN);

		byteToMethod.put(GET_MRL_PIN_TYPE,"getMrlPinType");
		methodToByte.put("getMrlPinType",GET_MRL_PIN_TYPE);

		byteToMethod.put(I2C_READ,"i2cRead");
		methodToByte.put("i2cRead",I2C_READ);

		byteToMethod.put(I2C_WRITE,"i2cWrite");
		methodToByte.put("i2cWrite",I2C_WRITE);

		byteToMethod.put(I2C_WRITE_READ,"i2cWriteRead");
		methodToByte.put("i2cWriteRead",I2C_WRITE_READ);

		byteToMethod.put(INTS_TO_STRING,"intsToString");
		methodToByte.put("intsToString",INTS_TO_STRING);

		byteToMethod.put(IS_ATTACHED,"isAttached");
		methodToByte.put("isAttached",IS_ATTACHED);

		byteToMethod.put(MOTOR_MOVE,"motorMove");
		methodToByte.put("motorMove",MOTOR_MOVE);

		byteToMethod.put(MOTOR_MOVE_TO,"motorMoveTo");
		methodToByte.put("motorMoveTo",MOTOR_MOVE_TO);

		byteToMethod.put(MOTOR_RESET,"motorReset");
		methodToByte.put("motorReset",MOTOR_RESET);

		byteToMethod.put(MOTOR_STOP,"motorStop");
		methodToByte.put("motorStop",MOTOR_STOP);

		byteToMethod.put(NEO_PIXEL_WRITE_MATRIX,"neoPixelWriteMatrix");
		methodToByte.put("neoPixelWriteMatrix",NEO_PIXEL_WRITE_MATRIX);

		byteToMethod.put(ON_SENSOR_DATA,"onSensorData");
		methodToByte.put("onSensorData",ON_SENSOR_DATA);

		byteToMethod.put(PIN_MODE,"pinMode");
		methodToByte.put("pinMode",PIN_MODE);

		byteToMethod.put(PUBLISH_ATTACHED_DEVICE,"publishAttachedDevice");
		methodToByte.put("publishAttachedDevice",PUBLISH_ATTACHED_DEVICE);

		byteToMethod.put(PUBLISH_BOARD_INFO,"publishBoardInfo");
		methodToByte.put("publishBoardInfo",PUBLISH_BOARD_INFO);

		byteToMethod.put(PUBLISH_BOARD_STATUS,"publishBoardStatus");
		methodToByte.put("publishBoardStatus",PUBLISH_BOARD_STATUS);

		byteToMethod.put(PUBLISH_DEBUG,"publishDebug");
		methodToByte.put("publishDebug",PUBLISH_DEBUG);

		byteToMethod.put(PUBLISH_MESSAGE_ACK,"publishMessageAck");
		methodToByte.put("publishMessageAck",PUBLISH_MESSAGE_ACK);

		byteToMethod.put(PUBLISH_PIN,"publishPin");
		methodToByte.put("publishPin",PUBLISH_PIN);

		byteToMethod.put(PUBLISH_PIN_ARRAY,"publishPinArray");
		methodToByte.put("publishPinArray",PUBLISH_PIN_ARRAY);

		byteToMethod.put(PUBLISH_PULSE,"publishPulse");
		methodToByte.put("publishPulse",PUBLISH_PULSE);

		byteToMethod.put(PUBLISH_PULSE_STOP,"publishPulseStop");
		methodToByte.put("publishPulseStop",PUBLISH_PULSE_STOP);

		byteToMethod.put(PUBLISH_SENSOR_DATA,"publishSensorData");
		methodToByte.put("publishSensorData",PUBLISH_SENSOR_DATA);

		byteToMethod.put(PUBLISH_SERVO_EVENT,"publishServoEvent");
		methodToByte.put("publishServoEvent",PUBLISH_SERVO_EVENT);

		byteToMethod.put(PUBLISH_TRIGGER,"publishTrigger");
		methodToByte.put("publishTrigger",PUBLISH_TRIGGER);

		byteToMethod.put(PULSE,"pulse");
		methodToByte.put("pulse",PULSE);

		byteToMethod.put(PULSE_STOP,"pulseStop");
		methodToByte.put("pulseStop",PULSE_STOP);

		byteToMethod.put(READ,"read");
		methodToByte.put("read",READ);

		byteToMethod.put(RELEASE_I2C_DEVICE,"releaseI2cDevice");
		methodToByte.put("releaseI2cDevice",RELEASE_I2C_DEVICE);

		byteToMethod.put(SENSOR_ACTIVATE,"sensorActivate");
		methodToByte.put("sensorActivate",SENSOR_ACTIVATE);

		byteToMethod.put(SENSOR_DEACTIVATE,"sensorDeactivate");
		methodToByte.put("sensorDeactivate",SENSOR_DEACTIVATE);

		byteToMethod.put(SENSOR_POLLING_START,"sensorPollingStart");
		methodToByte.put("sensorPollingStart",SENSOR_POLLING_START);

		byteToMethod.put(SENSOR_POLLING_STOP,"sensorPollingStop");
		methodToByte.put("sensorPollingStop",SENSOR_POLLING_STOP);

		byteToMethod.put(SERVO_ATTACH,"servoAttach");
		methodToByte.put("servoAttach",SERVO_ATTACH);

		byteToMethod.put(SERVO_DETACH,"servoDetach");
		methodToByte.put("servoDetach",SERVO_DETACH);

		byteToMethod.put(SERVO_EVENTS_ENABLED,"servoEventsEnabled");
		methodToByte.put("servoEventsEnabled",SERVO_EVENTS_ENABLED);

		byteToMethod.put(SERVO_SET_SPEED,"servoSetSpeed");
		methodToByte.put("servoSetSpeed",SERVO_SET_SPEED);

		byteToMethod.put(SERVO_SWEEP_START,"servoSweepStart");
		methodToByte.put("servoSweepStart",SERVO_SWEEP_START);

		byteToMethod.put(SERVO_SWEEP_STOP,"servoSweepStop");
		methodToByte.put("servoSweepStop",SERVO_SWEEP_STOP);

		byteToMethod.put(SERVO_WRITE,"servoWrite");
		methodToByte.put("servoWrite",SERVO_WRITE);

		byteToMethod.put(SERVO_WRITE_MICROSECONDS,"servoWriteMicroseconds");
		methodToByte.put("servoWriteMicroseconds",SERVO_WRITE_MICROSECONDS);

		byteToMethod.put(SET_DEBOUNCE,"setDebounce");
		methodToByte.put("setDebounce",SET_DEBOUNCE);

		byteToMethod.put(SET_DEBUG,"setDebug");
		methodToByte.put("setDebug",SET_DEBUG);

		byteToMethod.put(SET_DIGITAL_TRIGGER_ONLY,"setDigitalTriggerOnly");
		methodToByte.put("setDigitalTriggerOnly",SET_DIGITAL_TRIGGER_ONLY);

		byteToMethod.put(SET_PWMFREQUENCY,"setPWMFrequency");
		methodToByte.put("setPWMFrequency",SET_PWMFREQUENCY);

		byteToMethod.put(SET_SAMPLE_RATE,"setSampleRate");
		methodToByte.put("setSampleRate",SET_SAMPLE_RATE);

		byteToMethod.put(SET_SERIAL_RATE,"setSerialRate");
		methodToByte.put("setSerialRate",SET_SERIAL_RATE);

		byteToMethod.put(SET_TRIGGER,"setTrigger");
		methodToByte.put("setTrigger",SET_TRIGGER);

		byteToMethod.put(SOFT_RESET,"softReset");
		methodToByte.put("softReset",SOFT_RESET);

		byteToMethod.put(WRITE,"write");
		methodToByte.put("write",WRITE);


  }
  // -------- byteToMethod begin --------------------

  static public String byteToMethod(int m) {
    if (byteToMethod.containsKey(m)) {
      return byteToMethod.get(m);
    }
    return null;
  }

  /**
   * MAGIC_NUMBER|NUM_BYTES|FUNCTION|DATA0|DATA1|....|DATA(N)
   * 
   * @throws CodecException
   */
  @Override
  public String decodeImpl(int newByte) {

    // log.info(String.format("byteCount %d", byteCount));
    ++byteCount;
    if (byteCount == 1 && newByte != MAGIC_NUMBER) {
      // reset - try again
      rest.setLength(0);
      byteCount = 0;
      decodeMsgSize = 0;

      error("bad magic number %d", newByte);
    }

    if (byteCount == 2) {
      // get the size of message
      // todo check msg < 64 (MAX_MSG_SIZE)
      decodeMsgSize = newByte;
    }

    // set method
    if (byteCount == 3) {
      rest.append(byteToMethod.get(newByte));
    }

    if (byteCount > 3) {
      // FIXME - for
      rest.append(String.format("/%d", newByte));
    }

    // if received header + msg
    if (byteCount == 2 + decodeMsgSize) {
      // msg done
      byteCount = 0;
      rest.append("\n");
      String ret = rest.toString();
      rest.setLength(0);
      byteCount = 0;
      decodeMsgSize = 0;
      return ret;
    }

    // not ready yet
    // no msg :P should be null ???
    return null;
  }

  @Override
  public String decode(int[] msgs) {
    if (msgs == null) {
      return new String("");
    }

    log.info(String.format("decoding input of %d bytes", msgs.length));

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < msgs.length; ++i) {
      sb.append(decode(msgs[i]));
    }

    return sb.toString();
  }

  // must maintain state - partial string
  @Override
  public int[] encode(String msgs) {

    // moved all member vars as local
    // otherwise state information would explode
    // cheap way of making threadsafe
    // this variables
    int pos = 0;
    int newLinePos = 0;
    int slashPos = 0;

    ArrayList<Integer> temp = new ArrayList<Integer>();
    ArrayList<Integer> data = new ArrayList<Integer>();

    // --

    if (msgs == null) {
      return new int[0];
    }

    // log.info(String.format("encoding input of %d characters",
    // msgs.length()));

    newLinePos = msgs.indexOf("\n", pos);
    slashPos = msgs.indexOf("/", pos);

    // while not done - string not completed...
    // make sure you leave in a good state if not a full String

    // FIXME test cases - newLinePos == -1 pos == -1 00 01 10 11

    // while either / or new line or eof (string) [eof leave vars in
    // unfinished state]
    while (slashPos != -1 || newLinePos != -1) {

      // ++currentLine;

      if (slashPos > 0 && newLinePos > 0 && slashPos < newLinePos) {
        // digitalWrite/9/1
        // pos^ slashpos ^ ^newLinePos
        if (temp.size() == 0) {
          String method = msgs.substring(pos, slashPos);
          pos = slashPos + 1;
          // found method
          if (methodToByte.containsKey(method)) {
            temp.add(methodToByte.get(method));
          } else {
            error("method [%s] at position %d is not defined for codec", method, pos);
            pos = 0;
            data.clear();
          }
        } else {
          // in data region
          String param = msgs.substring(pos, slashPos);
          temp.add(Integer.parseInt(param));
          pos = slashPos + 1;
        }
      } else if ((slashPos > 0 && newLinePos > 0 && newLinePos < slashPos) || (slashPos == -1 && newLinePos > 0)) {
        // end of message slash is beyond newline || newline exists and
        // slash does not
        String param = msgs.substring(pos, newLinePos);
        temp.add(Integer.parseInt(param));
        pos = newLinePos + 1;
        slashPos = pos;

        // unload temp buffer - start next message - if there is one
        data.add(170);// MAGIC NUMBER
        data.add(temp.size());// SIZE
        for (int i = 0; i < temp.size(); ++i) {
          // should be end of record
          data.add(temp.get(i));
        }
        // clear buffer - ready for next message
        temp.clear();
      }

      newLinePos = msgs.indexOf("\n", pos);
      slashPos = msgs.indexOf("/", pos);

    }

    int[] ret = new int[data.size()];
    // for (int i : data) {
    for (int i = 0; i < data.size(); ++i) {
      ret[i] = data.get(i);
    }

    // FIXME - more cases when pos is reset - or all vars reset?
    pos = 0;
    data.clear();
    return ret;
  }

  @Override
  public String getCodecExt() {
    return getKey().substring(0, 3);
  }

  @Override
  public String getKey() {
    return "arduino";
  }
  
  public static String functionToString(int function) {
 	switch(function){
	case ArduinoMsgCodec.PUBLISH_MRLCOMM_ERROR:{
		return "PUBLISH_MRLCOMM_ERROR";

	}
	case ArduinoMsgCodec.GET_VERSION:{
		return "GET_VERSION";

	}
	case ArduinoMsgCodec.PUBLISH_VERSION:{
		return "PUBLISH_VERSION";

	}
	case ArduinoMsgCodec.ANALOG_WRITE:{
		return "ANALOG_WRITE";

	}
	case ArduinoMsgCodec.CREATE_I2C_DEVICE:{
		return "CREATE_I2C_DEVICE";

	}
	case ArduinoMsgCodec.DEVICE_ATTACH:{
		return "DEVICE_ATTACH";

	}
	case ArduinoMsgCodec.DEVICE_DETACH:{
		return "DEVICE_DETACH";

	}
	case ArduinoMsgCodec.DIGITAL_WRITE:{
		return "DIGITAL_WRITE";

	}
	case ArduinoMsgCodec.DISABLE_BOARD_STATUS:{
		return "DISABLE_BOARD_STATUS";

	}
	case ArduinoMsgCodec.DISABLE_PIN:{
		return "DISABLE_PIN";

	}
	case ArduinoMsgCodec.ENABLE_BOARD_STATUS:{
		return "ENABLE_BOARD_STATUS";

	}
	case ArduinoMsgCodec.ENABLE_PIN:{
		return "ENABLE_PIN";

	}
	case ArduinoMsgCodec.GET_MRL_PIN_TYPE:{
		return "GET_MRL_PIN_TYPE";

	}
	case ArduinoMsgCodec.I2C_READ:{
		return "I2C_READ";

	}
	case ArduinoMsgCodec.I2C_WRITE:{
		return "I2C_WRITE";

	}
	case ArduinoMsgCodec.I2C_WRITE_READ:{
		return "I2C_WRITE_READ";

	}
	case ArduinoMsgCodec.INTS_TO_STRING:{
		return "INTS_TO_STRING";

	}
	case ArduinoMsgCodec.IS_ATTACHED:{
		return "IS_ATTACHED";

	}
	case ArduinoMsgCodec.MOTOR_MOVE:{
		return "MOTOR_MOVE";

	}
	case ArduinoMsgCodec.MOTOR_MOVE_TO:{
		return "MOTOR_MOVE_TO";

	}
	case ArduinoMsgCodec.MOTOR_RESET:{
		return "MOTOR_RESET";

	}
	case ArduinoMsgCodec.MOTOR_STOP:{
		return "MOTOR_STOP";

	}
	case ArduinoMsgCodec.NEO_PIXEL_WRITE_MATRIX:{
		return "NEO_PIXEL_WRITE_MATRIX";

	}
	case ArduinoMsgCodec.ON_SENSOR_DATA:{
		return "ON_SENSOR_DATA";

	}
	case ArduinoMsgCodec.PIN_MODE:{
		return "PIN_MODE";

	}
	case ArduinoMsgCodec.PUBLISH_ATTACHED_DEVICE:{
		return "PUBLISH_ATTACHED_DEVICE";

	}
	case ArduinoMsgCodec.PUBLISH_BOARD_INFO:{
		return "PUBLISH_BOARD_INFO";

	}
	case ArduinoMsgCodec.PUBLISH_BOARD_STATUS:{
		return "PUBLISH_BOARD_STATUS";

	}
	case ArduinoMsgCodec.PUBLISH_DEBUG:{
		return "PUBLISH_DEBUG";

	}
	case ArduinoMsgCodec.PUBLISH_MESSAGE_ACK:{
		return "PUBLISH_MESSAGE_ACK";

	}
	case ArduinoMsgCodec.PUBLISH_PIN:{
		return "PUBLISH_PIN";

	}
	case ArduinoMsgCodec.PUBLISH_PIN_ARRAY:{
		return "PUBLISH_PIN_ARRAY";

	}
	case ArduinoMsgCodec.PUBLISH_PULSE:{
		return "PUBLISH_PULSE";

	}
	case ArduinoMsgCodec.PUBLISH_PULSE_STOP:{
		return "PUBLISH_PULSE_STOP";

	}
	case ArduinoMsgCodec.PUBLISH_SENSOR_DATA:{
		return "PUBLISH_SENSOR_DATA";

	}
	case ArduinoMsgCodec.PUBLISH_SERVO_EVENT:{
		return "PUBLISH_SERVO_EVENT";

	}
	case ArduinoMsgCodec.PUBLISH_TRIGGER:{
		return "PUBLISH_TRIGGER";

	}
	case ArduinoMsgCodec.PULSE:{
		return "PULSE";

	}
	case ArduinoMsgCodec.PULSE_STOP:{
		return "PULSE_STOP";

	}
	case ArduinoMsgCodec.READ:{
		return "READ";

	}
	case ArduinoMsgCodec.RELEASE_I2C_DEVICE:{
		return "RELEASE_I2C_DEVICE";

	}
	case ArduinoMsgCodec.SENSOR_ACTIVATE:{
		return "SENSOR_ACTIVATE";

	}
	case ArduinoMsgCodec.SENSOR_DEACTIVATE:{
		return "SENSOR_DEACTIVATE";

	}
	case ArduinoMsgCodec.SENSOR_POLLING_START:{
		return "SENSOR_POLLING_START";

	}
	case ArduinoMsgCodec.SENSOR_POLLING_STOP:{
		return "SENSOR_POLLING_STOP";

	}
	case ArduinoMsgCodec.SERVO_ATTACH:{
		return "SERVO_ATTACH";

	}
	case ArduinoMsgCodec.SERVO_DETACH:{
		return "SERVO_DETACH";

	}
	case ArduinoMsgCodec.SERVO_EVENTS_ENABLED:{
		return "SERVO_EVENTS_ENABLED";

	}
	case ArduinoMsgCodec.SERVO_SET_SPEED:{
		return "SERVO_SET_SPEED";

	}
	case ArduinoMsgCodec.SERVO_SWEEP_START:{
		return "SERVO_SWEEP_START";

	}
	case ArduinoMsgCodec.SERVO_SWEEP_STOP:{
		return "SERVO_SWEEP_STOP";

	}
	case ArduinoMsgCodec.SERVO_WRITE:{
		return "SERVO_WRITE";

	}
	case ArduinoMsgCodec.SERVO_WRITE_MICROSECONDS:{
		return "SERVO_WRITE_MICROSECONDS";

	}
	case ArduinoMsgCodec.SET_DEBOUNCE:{
		return "SET_DEBOUNCE";

	}
	case ArduinoMsgCodec.SET_DEBUG:{
		return "SET_DEBUG";

	}
	case ArduinoMsgCodec.SET_DIGITAL_TRIGGER_ONLY:{
		return "SET_DIGITAL_TRIGGER_ONLY";

	}
	case ArduinoMsgCodec.SET_PWMFREQUENCY:{
		return "SET_PWMFREQUENCY";

	}
	case ArduinoMsgCodec.SET_SAMPLE_RATE:{
		return "SET_SAMPLE_RATE";

	}
	case ArduinoMsgCodec.SET_SERIAL_RATE:{
		return "SET_SERIAL_RATE";

	}
	case ArduinoMsgCodec.SET_TRIGGER:{
		return "SET_TRIGGER";

	}
	case ArduinoMsgCodec.SOFT_RESET:{
		return "SOFT_RESET";

	}
	case ArduinoMsgCodec.WRITE:{
		return "WRITE";

	}

  
		default: {
			return "OTHER(" + Integer.toString(function) + ")";

		} // default
		} // switch
	}

    

  
}