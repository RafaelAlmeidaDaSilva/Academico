//----------------------------------------------------[ PROJETO GERENCIAMENTO DE ALUNOS ]---------------------------------------------------------------
//---------[Classe (MAIN.cpp)]>
//---------[Informa��es de Desenvolvimento]>
// DAT. INICIO:     23.03.16
// DATA ULT. ALT.:  23.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes

#include "Main.h"


void main()
{

	#if defined(_MSC_VER) 
	/*
	  - Essas linhas s� ser�o executadas se a vers�o da linguagem
	    do programa for compativel com a do sistema operacional
	*/

		setlocale(LC_ALL, "portuguese_brazil");
		Cons_Menu();
		PAUSE;
	#endif

}

