#include <iostream>
#include <cstdlib>
#include <string>
#define tamanho 5
#define aumento 1.1
using namespace std;
typedef struct empregados emp;
struct empregados{
 string nome[tamanho];
 int idade[tamanho];
 char sexo[tamanho];
 float salario[tamanho];
 float novoSalario[tamanho];
};
emp empr;
emp *ptempr = &empr;
int linha = -1;
string ler_Nome(){
  string nom;
  cout << "Digite o nome: ";
  cin.ignore();
  getline(cin,nom);
  return nom;
}
int ler_Idade(){
  int ida;
  cout << "Digite a idade: ";
  cin >> ida;
  return ida;
}
char ler_Sexo(){
  char sex;
  cout << "Digite o sexo(F/M): ";
  cin >> sex;
  return sex;
}
float ler_Salario(){
  float sal;
  cout << "Digite o salario: ";
  cin >> sal;
  return sal;
}
float getAumento(float base){
  float novoSal = base * aumento;
  return novoSal;
}
void NovaLinhaStruct(){
  linha++;
  cout << "--------------" << endl;
  ptempr->nome[linha] = ler_Nome();
  ptempr->idade[linha] = ler_Idade();
  ptempr->sexo[linha] = ler_Sexo();
  ptempr->salario[linha] = ler_Salario();
  ptempr->novoSalario[linha] = getAumento(ptempr->salario[linha]);
  return;
}
void listarLinhasStruct(){
  cout << "-------Lista de dados-------" << endl;
  for(int i = 0; i <= linha; i++){
    cout << ptempr->nome[i] << " - " << ptempr->idade[i] << " - " << ptempr->sexo[i] << " - " << ptempr->salario[i] << " - " << ptempr->novoSalario[i] << endl;
  }
  return;
}
int main () {
setlocale (LC_ALL, "Portuguese");
int selec = 0;
  while (selec != 3){
    cout << "---------------" << endl;
    cout << "1 - Ler linha\n2 - Mostrar\n3 - Sair\n Selecione: ";
    cin >> selec;
    switch (selec){
      case 1:
        NovaLinhaStruct();
        break;
      case 2:
        listarLinhasStruct();
        break;
    }
  }
return 0; 
}