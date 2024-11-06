// declare/define all integers and assign them the 
// value of appropriate pin number on arduino:
const int buzzer = 13;
const int threshold = 2;
int sensorPin = A0;
int sensorValue = 0;
int sensorPin1 = A2;
int sensorValue1 = 0;
#define ENABLE 5
#define DIRA 3
#define DIRB 4

// the setup routine runs once when you press reset:
void setup() 
{
  // initialize serial communication at 9600 bits per second:
  Serial.begin(9600);
  pinMode(buzzer,OUTPUT);
  pinMode(ENABLE,OUTPUT);
  pinMode(DIRA,OUTPUT);
  pinMode(DIRB,OUTPUT);
  
}

// the loop routine runs over and over again forever:
void loop() 
{
  // read the input on analog pin 0:
  int sensorValue = analogRead(A0);
  // Convert the analog reading (which goes from 0 - 1023) to a voltage (0 - 5V):
  float voltage = sensorValue * (5.0 / 1023.0);
  // print out the value you read:
  Serial.println(voltage);
  // read the value from the sensor:
  sensorValue1 = analogRead(sensorPin1);

  // if statement that controls fan motor:
  if (voltage> threshold)
  {
    // enable on:
    digitalWrite(ENABLE,HIGH); 
    // turns fan on and spins it in one specific direction:
    digitalWrite(DIRA,HIGH);
    // keeps fan from spinning in opposite direction
    digitalWrite(DIRB,LOW);
    
  }
  else
  {
    // keeps fan motor off if condition isn't met:
    digitalWrite(ENABLE, LOW);
  }

  // if statement that controls buzzer:
  if (voltage> threshold)
  {
    // turns the buzzer on:
    digitalWrite(buzzer, HIGH);
    // stop the program for <sensorValue> milliseconds:
    delay(sensorValue1);
    // turns the buzzer off:
    digitalWrite(buzzer, LOW);
    // stop the program for <sensorValue> milliseconds:
    delay(sensorValue1);
    
  }
  else
  {
    // keeps buzzer off if condition isn't met:
    digitalWrite(buzzer, LOW);
  }
} 
