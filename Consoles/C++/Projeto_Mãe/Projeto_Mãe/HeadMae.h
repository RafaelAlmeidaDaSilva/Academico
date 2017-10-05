//----------------------------------------------------[ PROJETO MÃE ]---------------------------------------------------------------
//---------[Classe (PRINCIPAL)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     16.03.16
// DATA ULT. ALT.:  16.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
// MOTIVO:
/* 
  - (Projeto Mãe) vem com o objetivo de integrar todos
   os conceitos e fundamentos aprendidos em sala e
   em casa.
*/

#include <iostream>
#include <Windows.h>
using namespace std;

//DEFINICOES 
#define PAUSE			  system("pause")
#define CLS               system("cls")

//PROTOTIPOS
void Cons_Menu();
void Cons_ExMatriz();
void Cons_ExVetor();
void BubbleSort(int nVetor[], int nQtde, bool flgOrdem);