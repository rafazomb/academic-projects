//Rafael Henrique 3ADS
#include <iostream>
#include <math.h>
#include <cstdlib>
#include <string>
using namespace std;
string exer[] = {"a" , "b" , "c" , "d" , "e" , "f" , "g"};//pg 74
int vetorA[10];
int vetorB1[8], vetorB2[8];
int vetorC1[20], vetorC2[20], vetorC3[20];
int vetorD1[15], vetorD2[15];
int vetorE1[15], vetorE2[15], vetorE3[30];
int vetorF1[20], vetorF2[30], vetorF3[50];
int vetorG1[20], vetorG2[20];
void exerA();
void exerB();
void exerC();
void exerD();
void exerE();
void exerF();
void exerG();

int main(){
  //system("clear");
  setlocale(LC_ALL, "Portuguese");
  int selec = 1;
  while (selec != 0){
    cout << "------------------------------------------------" << endl;
    cout << "Questões para executar" << endl;
    for (int i = 0; i < 7; i++){
      cout << i+1 << " - Exercicio " << exer[i] << endl;
    }
    cout << "0 - Sair" << endl;
    cout << "Selecione a questão que deseja executar: ";
    cin >> selec;
    cout << "------------------------------------------------" << endl;
    //system("clear");
    switch (selec){
      case 1:
      exerA();
      break;
      case 2:
      exerB();
      break;
      case 3:
      exerC();
      break;
      case 4:
      exerD();
      break;
      case 5:
      exerE();
      break;
      case 6:
      exerF();
      break;
      case 7:
      exerG();
      break;
    }
  }
  //system("pause");
  return 0;
}

void exerA(){
  for (int i = 0; i < 10; i++){
    cout << "Digite o " << i+1 << "º valor: ";
    cin >> vetorA[i];
  }
  cout << "Valores digitados: ";
  for (int i = 0; i < 10; i++){
    cout << vetorA[i] << ",";
  }
  cout << endl;
  return;
}
void exerB(){
  for (int i = 0; i < 8; i++){
    cout << "Digite o " << i+1 << "º valor: ";
    cin >> vetorB1[i];
  }
  for (int i = 0; i < 8; i++){
    vetorB2[i] = vetorB1[i] * 3;
    cout << "O triplo de cada valor é " << vetorB2[i] << endl;
  }
  return;
}
void exerC(){
  for (int i = 0; i < 20; i++){
    cout << "Digite o " << i+1 << "º valor de A e B(separado por espaço): ";
    cin >> vetorC1[i] >> vetorC2[i];
  }
  for (int i = 0; i < 20; i++){
    vetorC3[i] = vetorC1[i] - vetorC2[i];
    cout << "O valor de A menos o B é " << vetorC3[i] << endl;
  }
  return;
}
void exerD(){
  for (int i = 0; i < 15; i++){
    cout << "Digite o " << i+1 << "º valor: ";
    cin >> vetorD1[i];
  }
  for (int i = 0; i < 15; i++){
    vetorD2[i] = pow(vetorD1[i], 2);
    cout << "O quadrado de cada valor é " << vetorD2[i] << endl;
  }
  return;
}
void exerE(){
  for (int i = 0; i < 15; i++){
    cout << "Digite o " << i+1 << "º valor de A e B(separado por espaço): ";
    cin >> vetorE1[i] >> vetorE2[i];
  }
  for (int i = 0; i < 15; i++){
    vetorE3[i] = vetorE1[i];
    vetorE3[i+15] = vetorE2[i];
  }
  cout << "Os valores de C é: ";
  for (int i = 0; i < 30; i++){
    cout << vetorE3[i] << ",";
  }
  cout << endl;
  return;
}
void exerF(){
  for (int i = 0; i < 30; i++){
    if (i < 20) {
      cout << "Digite o " << i+1 << "º valor de A e B(separado por espaço): ";
      cin >> vetorF1[i] >> vetorF2[i];
    }
    else {
      cout << "Digite o " << i+1 << "º valor de B: ";
      cin >> vetorF2[i];
    }
  }
  for (int i = 0; i < 30; i++){
    if (i < 20){
      vetorF3[i] = vetorF1[i];
      vetorF3[i+20] = vetorF2[i];
    }
    else {
      vetorF3[i+20] = vetorF2[i];
    }
  }
  cout << "Os valores de C é: ";
  for (int i = 0; i < 50; i++){
    cout << vetorF3[i] << ",";
  }
  cout << endl;
  return;
}
void exerG(){
  int aux = 20;
  for (int i = 0; i < 20; i++){
    cout << "Digite o " << i+1 << "º valor de A: ";
    cin >> vetorG1[i];
  }
  for (int i = 0; i < 20; i++){
    aux = aux - 1;
    vetorG2[i] = vetorG1[aux];
    cout << "O valor de A é " << vetorG1[i] << " e o B é " << vetorG2[i] << endl;
  }
  return;
}