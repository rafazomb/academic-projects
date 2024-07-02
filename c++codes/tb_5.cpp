#include <iostream>
#include <cstdlib>
#include <math.h>
#include <string>
using namespace std;
int const n = 5;
int linha = -1;

struct tabela {
  double SM;
  double PR;
  double NS;
};
struct tabela salarios[n];

double lerValor (int tipo){
  double valor;
  cout << "Digite o valor do" << endl;
  if (tipo == 1){
    cout << "salário mensal: ";
    cin >> valor;
  }
  if (tipo == 2){
    cout << "percentual de reajuste(em decimal): ";
    cin >> valor;
  }
  return valor;
}
void guardarValores (){
  linha++;
  salarios[linha].SM = lerValor(1);
  salarios[linha].PR = lerValor(2);
  return;
}
void calcular (){
  cout << "Calculando..." << endl;
  for (int i = 0; i <= linha; i++){
    salarios[i].NS = salarios[i].SM + (salarios[i].SM * salarios[i].PR);
  }
  cout << "Concluído!" << endl;
}
void exibir (){
  for (int i = 0; i <= linha; i++){
    cout << i+1 << "° salario digitado corrigido: " << salarios[i].NS << endl;
  }
}
int main() {
  int tecla = 0;
  while (tecla != 4) {
    cout << "------------------" << endl;
    cout << "1 - Ler salario;\n2 - Calcular;\n3 - Exibir;\n4 - Sair.\nItem: ";
    cin >> tecla;
    cout << "------------------" << endl;
    switch (tecla){
      case 1:
        guardarValores();
        break;
      case 2:
        calcular();
        break;
      case 3:
        exibir();
        break;
      case 4:
        exit(0);  
        break;
    }
  }
  return 0;
}