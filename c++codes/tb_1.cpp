//Rafael Henrique 3ADS
#include <iostream>
#include <math.h>
#include <cstdlib>
using namespace std;

int main() {
  setlocale(LC_ALL, "Portuguese");
  float comprimento, altura, largura, volume;

  cout << "Digite o valor do comprimento da caixa retangular em cm: ";
  cin >> comprimento;
  cout << "Digite o valor da largura da caixa retangular em cm: ";
  cin >> largura;
  cout << "Digite o valor da altura da caixa retangular em cm: ";
  cin >> altura;
  volume = comprimento * altura * largura;
  cout << "O volume dessa caixa retangular é: " << volume << "cm³" << endl;
  
}