#ifndef ArduinoMsgCodec_h
#define ArduinoMsgCodec_h

/*******************************************************************
 * MRLCOMM FUNCTION GENERATED INTERFACE
 * this file was generated by ArduinoMsgCodec and ArduinoMsgCodec.h.template
 */

///// INO GENERATED DEFINITION BEGIN //////
// {publishMRLCommError Integer} 
#define PUBLISH_MRLCOMM_ERROR		1
// {getVersion} 
#define GET_VERSION		2
// {publishVersion Integer} 
#define PUBLISH_VERSION		3
// {analogWrite int int} 
#define ANALOG_WRITE		4
// {controllerAttach Arduino int} 
#define CONTROLLER_ATTACH		5
// {createI2cDevice I2CControl int int} 
#define CREATE_I2C_DEVICE		6
// {deviceAttach DeviceControl Object[]} 
#define DEVICE_ATTACH		7
// {deviceDetach DeviceControl} 
#define DEVICE_DETACH		8
// {digitalWrite int int} 
#define DIGITAL_WRITE		9
// {disableBoardStatus} 
#define DISABLE_BOARD_STATUS		10
// {disablePin int} 
#define DISABLE_PIN		11
// {disablePins} 
#define DISABLE_PINS		12
// {enableBoardStatus int} 
#define ENABLE_BOARD_STATUS		13
// {enablePin int} 
#define ENABLE_PIN		14
// {getMrlPinType PinDefinition} 
#define GET_MRL_PIN_TYPE		15
// {i2cRead I2CControl int int byte[] int} 
#define I2C_READ		16
// {i2cReturnData SensorData} 
#define I2C_RETURN_DATA		17
// {i2cWrite I2CControl int int byte[] int} 
#define I2C_WRITE		18
// {i2cWriteRead I2CControl int int byte[] int byte[] int} 
#define I2C_WRITE_READ		19
// {intsToString int[] int int} 
#define INTS_TO_STRING		20
// {isAttached} 
#define IS_ATTACHED		21
// {motorMove MotorControl} 
#define MOTOR_MOVE		22
// {motorMoveTo MotorControl} 
#define MOTOR_MOVE_TO		23
// {motorReset MotorControl} 
#define MOTOR_RESET		24
// {motorStop MotorControl} 
#define MOTOR_STOP		25
// {msgRoute} 
#define MSG_ROUTE		26
// {neoPixelSetAnimation NeoPixel int int int int int} 
#define NEO_PIXEL_SET_ANIMATION		27
// {neoPixelWriteMatrix NeoPixel List} 
#define NEO_PIXEL_WRITE_MATRIX		28
// {onSensorData SensorData} 
#define ON_SENSOR_DATA		29
// {pinMode int String} 
#define PIN_MODE		30
// {publishAttachedDevice String} 
#define PUBLISH_ATTACHED_DEVICE		31
// {publishBoardInfo BoardInfo} 
#define PUBLISH_BOARD_INFO		32
// {publishBoardStatus BoardStatus} 
#define PUBLISH_BOARD_STATUS		33
// {publishDebug String} 
#define PUBLISH_DEBUG		34
// {publishMessageAck} 
#define PUBLISH_MESSAGE_ACK		35
// {publishPin PinData} 
#define PUBLISH_PIN		36
// {publishPinArray PinData[]} 
#define PUBLISH_PIN_ARRAY		37
// {publishPulse Long} 
#define PUBLISH_PULSE		38
// {publishPulseStop Integer} 
#define PUBLISH_PULSE_STOP		39
// {publishSensorData SensorData} 
#define PUBLISH_SENSOR_DATA		40
// {publishServoEvent Integer} 
#define PUBLISH_SERVO_EVENT		41
// {publishTrigger Pin} 
#define PUBLISH_TRIGGER		42
// {pulse int int int int} 
#define PULSE		43
// {pulseStop} 
#define PULSE_STOP		44
// {read int} 
#define READ		45
// {releaseI2cDevice I2CControl int int} 
#define RELEASE_I2C_DEVICE		46
// {sensorActivate SensorControl Object[]} 
#define SENSOR_ACTIVATE		47
// {sensorDeactivate SensorControl} 
#define SENSOR_DEACTIVATE		48
// {sensorPollingStart String} 
#define SENSOR_POLLING_START		49
// {sensorPollingStop String} 
#define SENSOR_POLLING_STOP		50
// {servoAttach ServoControl int} 
#define SERVO_ATTACH		51
// {servoDetach ServoControl} 
#define SERVO_DETACH		52
// {servoEventsEnabled ServoControl boolean} 
#define SERVO_EVENTS_ENABLED		53
// {servoSetMaxVelocity ServoControl} 
#define SERVO_SET_MAX_VELOCITY		54
// {servoSetSpeed ServoControl} 
#define SERVO_SET_SPEED		55
// {servoSweepStart ServoControl} 
#define SERVO_SWEEP_START		56
// {servoSweepStop ServoControl} 
#define SERVO_SWEEP_STOP		57
// {servoWrite ServoControl} 
#define SERVO_WRITE		58
// {servoWriteMicroseconds ServoControl int} 
#define SERVO_WRITE_MICROSECONDS		59
// {setDebounce int} 
#define SET_DEBOUNCE		60
// {setDebug boolean} 
#define SET_DEBUG		61
// {setDigitalTriggerOnly Boolean} 
#define SET_DIGITAL_TRIGGER_ONLY		62
// {setPWMFrequency Integer Integer} 
#define SET_PWMFREQUENCY		63
// {setSampleRate int} 
#define SET_SAMPLE_RATE		64
// {setSerialRate int} 
#define SET_SERIAL_RATE		65
// {setTrigger int int int} 
#define SET_TRIGGER		66
// {softReset} 
#define SOFT_RESET		67
// {write int int} 
#define WRITE		68
///// INO GENERATED DEFINITION END //////


/*******************************************************************
 * serial protocol functions
 */
#define MAGIC_NUMBER            170 // 10101010


/*******************************************************************
 * BOARD TYPE
 */
#define BOARD_TYPE_ID_UNKNOWN 0
#define BOARD_TYPE_ID_MEGA    1
#define BOARD_TYPE_ID_UNO     2

#if defined(ARDUINO_AVR_MEGA2560) || defined(ARDUINO_AVR_ADK)
  #define BOARD BOARD_TYPE_ID_MEGA
#elif defined(ARDUINO_AVR_UNO)
  #define BOARD BOARD_TYPE_ID_UNO
#else
  #define BOARD BOARD_TYPE_ID_UNKNOWN
#endif

#endif
