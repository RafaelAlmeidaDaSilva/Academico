//----------------------------------------------------[ PROJETO M�E ]---------------------------------------------------------------
//---------[Classe (PRINCIPAL)]>
//---------[Informa��es de Desenvolvimento]>
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
	   - Essas linhas s� ser�o executadas se a vers�o da linguagem 
	   do programa for compativel com a do sistema operacional
	*/
	
	setlocale(LC_ALL, "portuguese_brazil");
	Cons_Menu();
	PAUSE;
	#endif

}

