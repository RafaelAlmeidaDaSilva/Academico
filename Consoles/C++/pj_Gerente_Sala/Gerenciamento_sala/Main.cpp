//----------------------------------------------------[ PROJETO GERENCIAMENTO DE ALUNOS ]---------------------------------------------------------------
//---------[Classe (MAIN.cpp)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     23.03.16
// DATA ULT. ALT.:  23.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes

#include "Main.h"


void main()
{

	#if defined(_MSC_VER) 
	/*
	  - Essas linhas só serão executadas se a versão da linguagem
	    do programa for compativel com a do sistema operacional
	*/

		setlocale(LC_ALL, "portuguese_brazil");
		Cons_Menu();
		PAUSE;
	#endif

}

