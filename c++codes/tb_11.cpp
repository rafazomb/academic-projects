#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>
using namespace std;
int tamaNu,tamaNo;
int * nums;
void crescer(){
  int aux;
   for (int i=0; i<=tamaNu-2; i++)
   for (int j=i; j<=tamaNu-1;j++)
   if ( nums[i] > nums[j] ){
   aux = nums[i];
   nums[i] = nums[j];
   nums[j] = aux;
   }
  return;
}
void descer(){
  int aux;
   for (int i=0; i<=tamaNu-2; i++)
   for (int j=i; j<=tamaNu-1;j++)
   if ( nums[i] < nums[j] ){
   aux = nums[i];
   nums[i] = nums[j];
   nums[j] = aux;
   }
  return;
}
void alfa(string nome[]){
  string aux;
   for (int i=0; i<=tamaNo-2; i++)
   for (int j=i; j<=tamaNo-1;j++)
   if ( nome[i] > nome[j] ){
   aux = nome[i];
   nome[i] = nome[j];
   nome[j] = aux;
   }
  return;
}
void buscNum(int num){
  int sem = 0;
  for(int i = 0; i < tamaNu; i++){
    if (nums[i] == num){
      cout << "o numero " << num << " esta na posição " << i << endl;
      sem = 1;
    }
  }
  if (sem == 0){
      cout << "não encontrado" << endl;
    }
  return;
}
void buscNom(string nome[], string busc){
  int sem = 0;
  for(int i = 0; i < tamaNo; i++){
    if (nome[i] == busc){
      cout << "o nome " << busc << " esta na posição " << i << endl;
      sem = 1;
    }
  }
  if (sem == 0){
      cout << "não encontrado" << endl;
    }
  return;
}
void exibir(string nome[]){
  cout << "Números: " << endl;
  for (int i = 0; i < tamaNu; i++){
    cout << nums[i] << ", ";
  }
  cout << endl;
  cout << "Nomes: " << endl;
  for (int i = 0; i < tamaNo; i++){
    cout << nome[i] << endl;
  }
  return;
}
int main() {
  int selec = 0, nume;
  string uso;
  cout << "=================Vetores=================" << endl;
  cout << "digite o tamanho do vetor de numeros: ";
  cin >> tamaNu;
  cout << "digite o tamanho do vetor de nomes: ";
  cin >> tamaNo;
  nums = (int *) malloc(tamaNu * sizeof(int));
  string nomes[tamaNo];
  for(int i = 0; i < tamaNu; i++){
    cout << "digite o " << i+1 << "º numero para lista: ";
    cin >> nums[i];
  }
  for(int i = 0; i < tamaNo; i++){
    cout << "digite o " << i+1 << "º nome para lista: ";
    cin.ignore();
    getline(cin, nomes[i]);
  }
  while (selec != 7){
  cout << "==================Menus==================" << endl;
  cout << "1 - Ordenar números por ordem crescente" << endl;
  cout << "2 - Ordenar números por ordem decrescente" << endl;
  cout << "3 - Ordenar nomes por ordem alfabetica" << endl;
  cout << "4 - Buscar um número" << endl;
  cout << "5 - Buscar um nome" << endl;
  cout << "6 - Exibir" << endl;
  cout << "7 - Sair" << endl;
  cout << "Selecionado: ";
  cin >> selec;
  cout << "=========================================" << endl;
  switch(selec){
    case 1:
      crescer();
      break;
    case 2:
      descer();
      break;
    case 3:
      alfa(nomes);
      break;
    case 4:
      cout << "digite o numero que deseja buscar: ";
      cin >> nume;
      buscNum(nume);
      break;
    case 5:
      cout << "digite o nome que deseja buscar: ";
      cin.ignore();
      getline(cin, uso);
      buscNom(nomes, uso);
      break;
    case 6:
      exibir(nomes);
      break;
  }
}
  free(nums);
  return 0;
}