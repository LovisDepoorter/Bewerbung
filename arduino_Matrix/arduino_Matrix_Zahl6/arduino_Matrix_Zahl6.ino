void setup() {
  pinMode(1,OUTPUT);
  pinMode(2,OUTPUT);
  pinMode(3,OUTPUT);
  pinMode(4,OUTPUT);
  pinMode(5,OUTPUT);
  pinMode(6,OUTPUT);
  pinMode(7,OUTPUT);
  pinMode(8,OUTPUT);
  pinMode(9,OUTPUT);
  pinMode(10,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(12,OUTPUT);

  digitalWrite(6,LOW);
  digitalWrite(7,LOW);
  digitalWrite(8,LOW);
  digitalWrite(9,LOW);
  digitalWrite(10,LOW);
  digitalWrite(11,LOW);
  digitalWrite(12,LOW);
}

void loop() {

//Zahl 6 Reihe 1
  digitalWrite(1,LOW);  digitalWrite(2,LOW);  digitalWrite(3,LOW);  digitalWrite(4,LOW);  digitalWrite(5,LOW);
  digitalWrite(6,HIGH); delay(1); digitalWrite(6,LOW);
 
//Zahl 6 Reihe 2
  digitalWrite(1,LOW);  digitalWrite(2,HIGH); digitalWrite(3,HIGH); digitalWrite(4,HIGH); digitalWrite(5,HIGH);
  digitalWrite(7,HIGH); delay(1); digitalWrite(7,LOW);

//Zahl 6 Reihe 3
  digitalWrite(1,LOW);  digitalWrite(2,HIGH); digitalWrite(3,HIGH); digitalWrite(4,HIGH); digitalWrite(5,HIGH);
  digitalWrite(8,HIGH); delay(1); digitalWrite(8,LOW);

//Zahl 6 Reihe 4
  digitalWrite(1,LOW);  digitalWrite(2,LOW);  digitalWrite(3,LOW);  digitalWrite(4,LOW);  digitalWrite(5,LOW);
  digitalWrite(9,HIGH); delay(1); digitalWrite(9,LOW);

//Zahl 6 Reihe 5
  digitalWrite(1,LOW);  digitalWrite(2,HIGH); digitalWrite(3,HIGH); digitalWrite(4,HIGH); digitalWrite(5,LOW);
  digitalWrite(10,HIGH);  delay(1); digitalWrite(10,LOW);

//Zahl 6 Reihe 6
  digitalWrite(1,LOW);  digitalWrite(2,HIGH); digitalWrite(3,HIGH); digitalWrite(4,HIGH); digitalWrite(5,LOW);
  digitalWrite(11,HIGH);  delay(1); digitalWrite(11,LOW);

//Zahl 6 Reihe 7
  digitalWrite(1,LOW);  digitalWrite(2,LOW);  digitalWrite(3,LOW);  digitalWrite(4,LOW);  digitalWrite(5,LOW);
  digitalWrite(12,HIGH);  delay(1); digitalWrite(12,LOW);
 
}
