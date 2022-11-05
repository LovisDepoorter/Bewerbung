int warte = 100;

int aa0[][5]= {
  { 0,0,0,0,0},
  { 0,1,1,1,0},
  { 0,1,1,1,0},
  { 0,1,1,1,0},
  { 0,1,1,1,0},
  { 0,1,1,1,0},
  { 0,0,0,0,0},
};

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

}
void ZeigeZiffer( int aaZahl[][5]){
  for ( int r= 0; r< 7; r++){ 
    for ( int c= 0; c< 5; c++) {
        digitalWrite( c+1, aaZahl[r][c]);
    }
    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW); 
  }
}


void loop() {
//Zahl 0
for (int  i=0;  i<75;  i++){
  ZeigeZiffer( aa0);
//  for ( int r= 0; r< 7; r++){ 
//    for ( int c= 0; c< 5; c++) {
//        digitalWrite( c+1, aa0[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW); 
//  }
}
}
