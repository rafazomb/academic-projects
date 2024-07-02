#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>
using namespace std;
int tamanho;
int * idade;
void ler(string nome[]){
  for(int i = 0; i < tamanho; i++){
    cout << "digite o " << i+1 << "º nome para lista: ";
    cin.ignore();
    getline(cin, nome[i]);
    cout << "digite a idade dessa pessoa: ";
    cin >> idade[i];
  }
}
void exibir(string nome[]){
  cout << "Nome - idade" << endl;
  for (int i = 0; i < tamanho; i++){
    cout << nome[i] << " - " << idade[i] << endl;
  }
}
void selectionSortIdade(string nome[]){
  int troca, min;
  string aux;
  for (int i=0; i<tamanho-1; i++){
    min = i;
    for (int j=i+1; j<tamanho; j++){
      if (idade[j] < idade[i])min  = j;
    }
    if (min != i){
      troca = idade[i];
      aux = nome[i];
      idade[i] = idade[min];
      nome[i] = nome[min];
      idade[min] = troca;
      nome[min] = aux;
    }
  }
}
void selectionSortNome(string nome[]){
  int aux, min;
  string troca;
  for (int i=0; i<tamanho-1; i++){
    min = i;
    for (int j=i+1; j<tamanho; j++){
      if (nome[j] < nome[i])min  = j;
    }
    if (min != i){
      aux = idade[i];
      troca = nome[i];
      idade[i] = idade[min];
      nome[i] = nome[min];
      idade[min] = aux;
      nome[min] = troca;
    }
  }
}
void insertionSortIdade ( string arr[]) {
 int i, key, j;
 string aux;
 for ( i = 1; i < tamanho; i++ ) {
 key = idade[i];
 aux = arr[i];
 j = i - 1;
 while (j >= 0 && idade[j] > key) {
 idade[j + 1] = idade[j];
 arr[j + 1] = arr[j];
 j = j - 1;
 }
 idade[j + 1] = key;
 arr[j + 1] = aux;
 }
}
void insertionSortNome ( string arr[]) {
 int i, j, aux;
 string key;
 for ( i = 1; i < tamanho; i++ ) {
 key = arr[i];
 aux = idade[i];
 j = i - 1;
 while (j >= 0 && arr[j] > key) {
 arr[j + 1] = arr[j];
 idade[j + 1] = idade[j];
 j = j - 1;
 }
 arr[j + 1] = key;
 idade[j + 1] = aux;
 }
}
int BuscaIdade (){
  int min = 0, max = tamanho - 1, meio,valor;
  cout << "digite a idade que deseja buscar: ";
  cin >> valor;
  while (min <= max){
    meio = (min+max)/2;
    if (idade[min] == valor){
      return min;
    }
    else if (idade[max] == valor){
      return max; 
    }
    else if (idade[meio] == valor){
      return meio;
    }
    else if (idade[meio] < valor) min = meio + 1;
    else max = meio - 1;
    }
  return -1;
}
int BuscaNome (string nome[]){
  int min = 0, max = tamanho - 1, meio;
  string valor;
  cout << "digite o nome que deseja buscar: ";
  cin.ignore();
  getline(cin, valor);
  while (min <= max){
    meio = (min+max)/2;
    if (nome[min] == valor){
      return min; 
    }
    else if (nome[max] == valor){
      return max;
    }
    else if (nome[meio] == valor){
      return meio;
    }
    else if (nome[meio] < valor) min = meio + 1;
    else max = meio - 1;
    }
  return -1;
}
int main() {
  int selec = 0, indice;
  string uso;
  cout << "digite o tamanho da lista dos nomes e idade: ";
  cin >> tamanho;
  idade = (int *) malloc(tamanho * sizeof(int));
  string nomes[tamanho];
  while (selec != 9){
    cout << "==================Menus==================" << endl;
    cout << "1 - Ler nomes e idade" << endl;
    cout << "2 - Exibir tabela" << endl;
    cout << "3 - Ordenar por idade com selection sort" << endl;
    cout << "4 - Ordenar por idade com insertion sort" << endl;
    cout << "5 - Ordenar por nomes com selection sort" << endl;
    cout << "6 - Ordenar por nomes com insertion sort" << endl;
    cout << "7 - Busca binaria de idade" << endl;
    cout << "8 - Busca binaria de nome" << endl;
    cout << "9 - Sair" << endl;
    cout << "Selecionado: ";
    cin >> selec;
    cout << "=========================================" << endl;
    switch(selec){
      case 1:
        ler(nomes);
        break;
      case 2:
        exibir(nomes);
        break;
      case 3:
        selectionSortIdade(nomes);
        break;
      case 4:
        insertionSortIdade(nomes);
        break;
      case 5:
        selectionSortNome(nomes);
        break;
      case 6:
        insertionSortNome(nomes);
        break;
      case 7:
        indice = BuscaIdade();
        if (indice == -1)cout << "Valor não encontrado" << endl;
        else cout << "Valor encontrado no indice: " << indice << endl;
        break;
      case 8:
        indice = BuscaNome(nomes);
        if (indice == -1)cout << "Valor não encontrado" << endl;
        else cout << "Valor encontrado no indice: " << indice << endl;
        break;
    }
  }
  free(idade);
  return 0;
}
