int motor = 9;

void setup(){
pinMode(motor,OUTPUT);
}

void loop(){
int onTime = 2500;
int offTime = 4000;
digitalWrite(motor,HIGH);
delay(onTime);
digitalWrite(motor,LOW);
delay(offTime);
}
