//----------------------------------------------------[ PROJETO MÃE ]---------------------------------------------------------------
//---------[Classe (MENU)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     16.03.16
// DATA ULT. ALT.:  16.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
// MOTIVO da Classe:
/* 
   - Tornar o programa capaz de executar todas 
    a classes de uma maneira mais flexivel.
*/
#include "HeadMae.h"

char Menu_Itens();
bool Funcao_Item_Escolhido_Menu(char item);

void Cons_Menu()
{
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens();
		Finaly_program= Funcao_Item_Escolhido_Menu(item);
     
       } while (Finaly_program);
}

bool Funcao_Item_Escolhido_Menu(char item)
{
	switch (item)
	{
	case'0':
		cout << "Função escolhida foi a do 0"<<endl;
		return false; // false para sair 
	case'1':
		cout << "Função escolhida foi a do 1" << endl;
		Cons_ExVetor();
		return true;
	case'2':
		Cons_ExMatriz();
		return true;
	case'3':
		cout << "Função escolhida foi a do 3" << endl;
		return true;
	case'4':
		cout << "Função escolhida foi a do 4" << endl;
		return true;
	default:
		return true;
	}
}

char Menu_Itens()
{
	CLS;

	char ch_item;
	cout << " <-----------------------------------[ MENU ]-------------------------------->"<<endl;
	cout << "\n\t" << "digite número correspondente:                                      " << endl;
	cout << "\n\t" << "                                                                   " << endl;
	cout << "\n\t" << "                        1- Ex.Vetor[]                              " << endl;
	cout << "\n\t" << "                        2- Ex.Matriz[][]                           " << endl;
	cout << "\n\t" << "                        3- Ex.Recursividade                        " << endl;
	cout << "\n\t" << "                        4- Ex.Ponteiros                            " << endl;
	cout << "\n\t" << "                                                         0- Sair   " << endl;
	cout << " <--------------------------------------------------------------------------->" << endl;
	cout << "  --->{ " ;

	cin >> ch_item;
	return ch_item;
}

