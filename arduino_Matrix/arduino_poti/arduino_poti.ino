

int R_Pin = A0;
int R =0;



void setup() {

  Serial.begin(9600);
  pinMode(12,OUTPUT);

  pinMode(R_Pin,INPUT);

}

void loop() {
  
  R=analogRead(R_Pin);
  Serial.println(R);

  digitalWrite(12,HIGH);
  delay(R);
  digitalWrite(12,LOW);
  delay(R);

  
}
