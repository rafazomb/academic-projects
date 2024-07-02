#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>
using namespace std;
typedef struct salapilha pilha;
struct salapilha{
string nome;
double salario;
pilha *ant;
};
pilha *topo = NULL;
void pushPilha(){
  double n;
  string nom;
  cout << "Digite o nome da pessoa: ";
  cin.ignore();
  getline(cin,nom);
  cout << "Digite o salario da pessoa: ";
  cin >> n;
  pilha * newPilha = (pilha*)malloc(sizeof(pilha));
  newPilha->nome = nom;
  newPilha->salario = n;
  if(topo == NULL){
    newPilha->ant = NULL;
  }
  else{
    newPilha->ant = topo;
  }
  topo = newPilha;
  return;
}
void popPilha(){
  string nome;
  pilha *temp;
  temp = topo;
  nome = topo->nome;
  topo = topo->ant;
  free(temp);
  cout << "Removido o " << nome << " da pilha" << endl;
  return;
}
void exibPilha(){
  pilha *temp;
  temp = topo;
  if (topo != NULL){
  while (temp->ant != NULL){
    cout << temp->nome << " com salario de " << temp->salario << endl;
    temp = temp->ant;
  }
    cout << temp->nome << " com salario de " << temp->salario << endl;
  }
  else{
    cout << "Pilha vazia" << endl;
  }
  return;
}
bool vazio(){
  if(topo == NULL){
    return true;
  }
  else{
    return false;
  }
}
void excluirPilha(){
  pilha *temp;
  while(topo != NULL){
    temp = topo;
    topo = topo->ant;
    free(temp);
  }
  free(topo);
  cout << "Pilha excluida" << endl;
}
int main(){
  int esco=0;
  while (esco != 6){
    cout << "----------------------" << endl;
    cout << "1 - Push" << endl;
    cout << "2 - Pop" << endl;
    cout << "3 - Exibir" << endl;
    cout << "4 - Verificar" << endl;
    cout << "5 - Excluir" << endl;
    cout << "6 - Sair" << endl;
    cout << "Escolha: ";
    cin >> esco;
    cout << "----------------------" << endl;
    switch(esco){
      case 1:
        pushPilha();
        break;
      case 2:
        popPilha();
        break;
      case 3:
        exibPilha();
        break;
      case 4:
        if(vazio()== true){
          cout << "Pilha vazia" << endl;
        }
        else{
          cout << "Pilha nao vazia" << endl;
        }
        break;
      case 5:
        excluirPilha();
        break;
  }
  }
}