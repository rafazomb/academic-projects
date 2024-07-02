//Rafael Henrique
#include <iostream>
#include <cstdlib>
#include <math.h>
#include <string>
using namespace std;
int linha = -1;
string nomes[5];
int idades[5];

string lerNome(){
  string nome; 
  cout << "Digite o nome: ";
  cin.ignore();
  getline(cin, nome);
  return nome;
}
int lerIdade(){
  int idade;
  cout << "Digite a idade: ";
  cin >> idade;
  return idade;
}
void novaLinha(string nom, int ida){
  linha++;
  nomes[linha] = nom;
  idades[linha] = ida;
}
void listar(){
  int menor,maior,menorI,maiorI,total = 0;
  double media;
  for(int i = 0; i <= linha; i++){
    if(idades[i] > maior || i == 0){
      maior = idades[i];
      maiorI = i;
    }
    if(idades[i] < menor || i == 0){
      menor = idades[i];
      menorI = i;
    }
    total += idades[i];
  }
  media = total/(linha+1);
  cout << "Maior idade: " << nomes[maiorI] << endl;
  cout << "Menor idade: " << nomes[menorI] << endl;
  cout << "Média das idades: " << media << endl;
  cout << "Saldo das idades: " << total << endl;
}
int main() {
  //system("clear");
  setlocale(LC_ALL, "Portuguese");
  string nome_;
  int idade_;
  int tecla;
  MENU:
  cout << "-------------MENU-------------\n1 Inserir nome e idade\n2 Exibir valores\n3 Sair\nitem: ";
  cin >> tecla;
  cout << "------------------------------"<< endl;
  switch (tecla){
    case 1:
      nome_ = lerNome();
      idade_ = lerIdade();
      novaLinha(nome_, idade_);
    break;
    case 2:
      listar();
    break;
    case 3:
    exit(0);
    break;
  }
  goto MENU;
  return 0;
}