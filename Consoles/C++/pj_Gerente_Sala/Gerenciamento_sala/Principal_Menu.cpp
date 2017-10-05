//----------------------------------------------------[ PROJETO GERENCIAMENTO DE ALUNOS ]---------------------------------------------------------------
//---------[Classe (Menu.cpp)]>
//---------[Informa��es de Desenvolvimento]>
// DAT. INICIO:     23.03.16
// DATA ULT. ALT.:  23.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
#include "Main.h"
#include "Colecao_Alunos.h"

char Menu_Itens();
bool Funcao_Item_Escolhido_Menu(char item);
void Cons_Inserir(ALUNO aluno, INFORMACAO info);    // INSERIR
void Cons_Listar(ALUNO aluno, INFORMACAO info);     // LISTAR

// Fun��o de constru��o dos metodos da classe.
void Cons_Menu()
{
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens();
		Finaly_program = Funcao_Item_Escolhido_Menu(item);

	} while (Finaly_program);
}

ALUNO aluno;
INFORMACAO info;

// Fun��o que seleciona o metodo pelo o item escolhido
//	Par�metros:
//		Entrada: char ch_item: item de sele��o do menu.
bool Funcao_Item_Escolhido_Menu(char item)
{
	

	switch (item)
	{
	case'0':
		CLS;
		cout << "Fim. " << endl;
		return false; 
	case'1':
		CLS;
		Cons_Inserir(aluno, info);
		return true;
	case'2':
		Cons_Listar(aluno, info);
		return true;
	case'3':
		cout << "Fun��o escolhida foi a do 3" << endl;
		return true;
	case'4':
		cout << "Fun��o escolhida foi a do 4" << endl;
		return true;
	default:
		return true;
	}
}

// Fun��o que mostra o menu principal no console.
char Menu_Itens()
{
	CLS;

	char ch_item;
	cout << " <-----------------------------------[ MENU ]-------------------------------->" << endl;
	cout << "\n\t" << "digite valor correspondente:                                       " << endl;
	cout << "\n\t" << "                                                                   " << endl;
	cout << "\n\t" << "                        1- Inserir                                 " << endl;
	cout << "\n\t" << "                        2- Listar                                  " << endl;
	cout << "\n\t" << "                        3- Ordenar                                 " << endl;
	cout << "\n\t" << "                        4- Nota                                    " << endl;
	cout << "\n\t" << "                                                         0- Sair   " << endl;
	cout << " <--------------------------------------------------------------------------->" << endl;
	cout << "  --->{ ";

	cin >> ch_item;
	return ch_item;
}