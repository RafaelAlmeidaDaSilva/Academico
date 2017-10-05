//----------------------------------------------------[ PROJETO MÃE ]---------------------------------------------------------------
//---------[Classe (PRINCIPAL)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     16.03.16
// DATA ULT. ALT.:  16.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
// MOTIVO da Classe:
        /* 
		     - Tratar erros de sistema operacional, tornando o 
		     programa mais organizado e bem estruturado.
		*/

#include "HeadMae.h"

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

