int U_Pin = A0;
int U =0;

//char warte = U;
//bytes in bits ändern = weniger ROM belastung
const char a0[]= {
  0b00000,
  0b01110,
  0b01110,
  0b01110,
  0b01110,
  0b01110,
  0b00000,
};
//const char aa0[][5]= { mit bytes gearbeitet= höhere Speichernutzung in ROM
//  { 0,0,0,0,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,0,0,0,0},
//};
const char a1[]={
  0b11011,
  0b11001,
  0b11010,
  0b11011,
  0b11011,
  0b11011,
  0b00000,
};
//const char aa1[][5]={
//  { 1,1,0,1,1},
//  { 1,0,0,1,1},
//  { 0,1,0,1,1},
//  { 1,1,0,1,1},
//  { 1,1,0,1,1},
//  { 1,1,0,1,1},
//  { 0,0,0,0,0},
//};
const char a2[]={
  0b00000,
  0b01111,
  0b01111,
  0b00000,
  0b11110,
  0b11110,
  0b00000,
};
//const char aa2[][5]={
//  { 0,0,0,0,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//  { 0,0,0,0,0},
//  { 0,1,1,1,1},
//  { 0,1,1,1,1},
//  { 0,0,0,0,0},
//};
const char a3[]={
  0b00000,
  0b01111,
  0b01111,
  0b00000,
  0b01111,
  0b01111,
  0b00000,
};
//const char aa3[][5]={
//  { 0,0,0,0,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//  { 0,0,0,0,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//  { 0,0,0,0,0},
//};
const char a4[]={
  0b10110,
  0b10110,
  0b10110,
  0b10000,
  0b10111,
  0b10111,
  0b10111,
};
//const char aa4[][5]={
//  { 0,1,1,0,1},
//  { 0,1,1,0,1},
//  { 0,1,1,0,1},
//  { 0,0,0,0,1},
//  { 1,1,1,0,1},
//  { 1,1,1,0,1},
//  { 1,1,1,0,1},
//};
const char a5[]={
  0b00000,
  0b11110,
  0b11110,
  0b00000,
  0b01111,
  0b01111,
  0b00000,
};
//const char aa5[][5]={
//  { 0,0,0,0,0},
//  { 0,1,1,1,1},
//  { 0,1,1,1,1},
//  { 0,0,0,0,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//  { 0,0,0,0,0},
//};
const char a6[]={
  0b00000,
  0b11110,
  0b11110,
  0b00000,
  0b01110,
  0b01110,
  0b00000,
};
//const char aa6[][5]={
//  { 0,0,0,0,0},
//  { 0,1,1,1,1},
//  { 0,1,1,1,1},
//  { 0,0,0,0,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,0,0,0,0},
//};
const char a7[]={
  0b00000,
  0b01110,
  0b01110,
  0b01111,
  0b01111,
  0b01111,
  0b01111,
};
//const char aa7[][5]={
//  { 0,0,0,0,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//};
const char a8[]={
  0b00000,
  0b01110,
  0b01110,
  0b00000,
  0b01110,
  0b01110,
  0b00000,
};
//const char aa8[][5]={
//  { 0,0,0,0,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,0,0,0,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,0,0,0,0},
//};
const char a9[]={
  0b00000,
  0b01110,
  0b01110,
  0b00000,
  0b01111,
  0b01111,
  0b00000,
};
//const char aa9[][5]={
//  { 0,0,0,0,0},
//  { 0,1,1,1,0},
//  { 0,1,1,1,0},
//  { 0,0,0,0,0},
//  { 1,1,1,1,0},
//  { 1,1,1,1,0},
//  { 0,0,0,0,0},
//};
void setup() {
  pinMode(13,OUTPUT);
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
  Serial.begin(9600);
  pinMode(U_Pin,INPUT);
}
//void ZeigeZiffer( const char aaZahl[][5]){ alte byte Zahlen
//    U=analogRead(U_Pin);
//    Serial.println(U);
//  for ( int r= 0; r< 7; r++){ 
//    for ( int c= 0; c< 5; c++) {
//        digitalWrite( c== 0 ? 13 : c+1, aaZahl[r][c]);
//        if( c== 0)
//          digitalWrite( 13, aaZahl[r][c]);
//        else
//          digitalWrite( c+1, aaZahl[r][c]);
//        int c1= c+1;
//        if( c== 0)
//          c1=13;
//        digitalWrite( c1, aaZahl[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(U+1); digitalWrite(6+r,LOW); 
//  }
//}
void ZeigeBitZiffer( const char aZahl[]){
    U=analogRead(U_Pin);
    Serial.println(U);
  for ( int r= 0; r< 7; r++){ 
    for ( int c= 0; c< 5; c++) {
        digitalWrite( c== 0 ? 13 : c+1, aZahl[r]&(1<<c) );
//        if( c== 0)
//          digitalWrite( 13, aaZahl[r][c]);
//        else
//          digitalWrite( c+1, aaZahl[r][c]);
//        int c1= c+1;
//        if( c== 0)
//          c1=13;
//        digitalWrite( c1, aaZahl[r][c]);
    }
    digitalWrite(6+r,HIGH); delay(U+1); digitalWrite(6+r,LOW); 
  }
}

void loop() {
  
//Zahl 0
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a0);
//ZeigeZiffer( aa0); alte byte ZeigeZiffer
//  for ( char r= 0; r< 7; r++){ 
//    for ( char c= 0; c< 5; c++) {
//        digitalWrite( c+1, aa0[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW); 
//  }
}
  
//Zahl 1
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a1);
//ZeigeZiffer( aa1);
//  for (char r=0; r<7; r++){
//    for (char c=0; c<5; c++) {  
//         digitalWrite (c+1, aa1[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);  
//  }
}
//Zahl 2
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a2);
//ZeigeZiffer( aa2);
//  for (char r=0; r<7; r++){
//    for (char c=0; c<5; c++)  { 
//        digitalWrite(c+1, aa2[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);      
//  }
}
//Zahl 3
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a3);
//ZeigeZiffer( aa3);
//  for (char r=0; r<7; r++){
//    for (char c=0; c<5;  c++)   {
//        digitalWrite(c+1, aa3[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);
//  }
}
//Zahl 4 
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a4);
//ZeigeZiffer( aa4);
//  for (char  r=0;  r<7;  r++){
//    for (char  c=0;  c<5;  c++)  { 
//        digitalWrite(c+1, aa4[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);      
//  }
}
//Zahl 5
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a5);
//ZeigeZiffer( aa5);
//  for (char r=0; r<7;  r++){
//    for (char  c=0;  c<5;  c++)   {
//        digitalWrite(c+1, aa5[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);      
//  }
}
//Zahl 6 
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a6);
//ZeigeZiffer( aa6);
//  for (char  r=0;  r<7;  r++){
//    for (char  c=0;  c<5;  c++)  {
//        digitalWrite(c+1, aa6[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);
//  }
}
//Zahl 7 
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a7);
//ZeigeZiffer( aa7);
//  for (char  r=0;  r<7;  r++){
//    for (char c=0; c<5;  c++)   {
//        digitalWrite(c+1, aa7[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);    
//  }
} 
//Zahl 8
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a8);
//ZeigeZiffer( aa8);
//  for (char  r=0;  r<7;  r++){
//    for (char  c=0;  c<5;  c++)   {
//        digitalWrite(c+1, aa8[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);
//  }
}
//Zahl 9
for (char  i=0;  i<25;  i++){
  ZeigeBitZiffer(a9);
//ZeigeZiffer( aa9);
//  for (char  r=0;  r<7;  r++){
//    for (char  c=0;  c<5;  c++){   
//        digitalWrite(c+1,  aa9[r][c]);
//    }
//    digitalWrite(6+r,HIGH); delay(warte); digitalWrite(6+r,LOW);         
//  }
} 
}
