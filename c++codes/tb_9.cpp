#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
using namespace std;
int n;
double nums[5];
double gerarNum(){
  return rand () % 100 * 0.1; }
void lerNum(){
   cout << "Quantos numeros deseja gerar? "; 
   cin >> n;
   for (int i=0; i<n; i++){
       nums[i] = gerarNum();
   }
  return;
}
void exiNum(int x){
  double min, max, med, soma = 0;
  for (int i = 0; i < x; i++){
    if (i == 0 | nums[i] < min) min = nums[i];
    if (i == 0 | nums[i] > max) max = nums[i];
    soma += nums[i];
  }
  med = soma / x;
  cout << "Mínimo: " << min << "\nMaximo: " << max << "\nMédia: " << med << endl;
  cout << "Soma: " << soma << endl;
  return;
}
int main() {
  int esc = 0;
  srand (time (NULL));
  while (esc != 3){
    cout << "----------------------------" << endl;
    cout << "1 - Gerar numeros aleatorios" << endl;
    cout << "2 - Calcular e mostrar numeros" << endl;
    cout << "3 - Sair" << endl;
    cout << "Escolha: ";
    cin >> esc;
    if (esc == 1){
      lerNum();
    }
    if (esc == 2){
      exiNum(n);
     }
    }
  } 