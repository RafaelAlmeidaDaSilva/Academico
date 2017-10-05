//----------------------------------------------------[ PROJETO GERENCIAMENTO DE ALUNOS ]---------------------------------------------------------------
//---------[Classe (MAIN.h)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     23.03.16
// DATA ULT. ALT.:  23.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes

#include <iostream>
#include <Windows.h>
using namespace std;

//DEFINICOES GERAIS
#define PAUSE			  system("pause")
#define CLS               system("cls")

//DEFINIÇÕES ESPECIFICAS 
#define QTDE_MAX_ALUNO		50
#define QTDE_MIN_ALUNO		4
#define EXTENSAO_NOME		40	
#define MASCULINO			'M'
#define FEMININO			'F'
#define NOTA_MINIMA			0
#define NOTA_MAXIMA			10

//DADOS 
typedef struct tagALUNO
{
	int nCodigo;								// código do cliente
	char cNome[EXTENSAO_NOME - 1],				// nome do cliente
	     cSexo;									// sexo do cliente
	int nNota;

} ALUNO;


//PROTÓTIPOS 
void Cons_Menu();   // MENU PRINCIPAL
