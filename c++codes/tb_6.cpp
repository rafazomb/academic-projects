#include <iostream>
#include <cstdlib>
#include <math.h>
using namespace std;

int vetorA[] = {2,4,6,8,10,12,14,16,18,20,22};
int main() {
  int valorDe = 18;
  int fim = sizeof(vetorA)/sizeof(int) -1;
  int inicio = 0;
  int meio;
  while (vetorA[inicio] != valorDe){
    if (vetorA[inicio] <= valorDe & valorDe <= vetorA[fim]){
      meio = (inicio + fim)/2;
      if (vetorA[meio] == valorDe){
        cout << "Valor encontrado na posição " << meio << " é " << vetorA[meio] << endl;
        break;
      }
      if (vetorA[meio] > valorDe){
        fim = meio;
      }
      else{
        inicio = meio;
      }
    }
    else{
      cout << "Valor não encontrado";
      break;
    }
  }
}