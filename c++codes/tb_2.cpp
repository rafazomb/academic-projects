// Rafael Henrique 3ADS
#include <iostream>
#include <iomanip>
#include <math.h>
#include <cstdlib>
using namespace std;
double const pi = 3.14;
double comprimento();
void diamentro(double comp1);
void raio(double comp2);
void area(double comp3);

int main (){
system("clear");
  setlocale(LC_ALL, "Portuguese");
  double comp;
  int selec;
  selec = 1;
  while (selec != 0){
    cout << "1 - Inserir o comprimento da circunferência" << endl;
    cout << "2 - Calcular o diâmetro da circunferência" << endl;
    cout << "3 - Calcular o raio da circunferência" << endl;
    cout << "4 - Calcular a área da circunferência" << endl; 
    cout << "0 - Sair" << endl;
    cout << "Selecione o que deseja fazer: ";
    cin >> selec;
    system("clear");
    switch (selec){
      case 1:
        comp = comprimento();
        break;
      case 2:
        diamentro(comp);
        break;
      case 3:
        raio(comp);
        break;
      case 4:
        area(comp);
        break;
    }
  }
system("pause");
}

double comprimento(){
  double compri;
  cout << "Digite o comprimento do circulo: ";
  cin >> compri;
  return compri;
}

void diamentro(double comp1){
  double diametro;
  diametro = comp1 / pi;
  cout << "O diametro do circulo é: " << diametro << endl;
  cout << "Insira algum numero para continuar";
  cin >> diametro;
  system("clear");
  return;
}

void raio(double comp2){
  double raio;
  raio = comp2 / (2 * pi);
  cout << "O raio do circulo é: " << raio << endl;
  cout << "Insira algum numero para continuar";
  cin >> raio;
  system("clear");
  return;
}

void area(double comp3){
  double area, raio;
  raio = comp3 /  (2 * pi);
  area = pow(raio, 2) * pi;
  cout << "A área do circulo é: " << area << endl;
  cout << "Insira algum numero para continuar";
  cin >> area;
  system("clear");
  return;
}