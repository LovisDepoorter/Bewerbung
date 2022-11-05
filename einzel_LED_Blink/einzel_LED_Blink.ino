#define LED1  13

void setup() {
  pinMode(LED1,OUTPUT);
}

void loop() {
  digitalWrite(LED1,HIGH);
  delay(200);
  digitalWrite(LED1,LOW);
  delay(1000);
}
