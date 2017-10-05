//----------------------------------------------------[ PROJETO GERENCIAMENTO DE ALUNOS ]---------------------------------------------------------------
//---------[Classe (Listar.cpp)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     25.03.16
// DATA ULT. ALT.:  25.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
#include "Main.h"
#include "Colecao_Alunos.h"

bool Funcao_Item_Escolhido_Menu_Listar(char item, ALUNO aluno, INFORMACAO info);
char Menu_Itens_Listar();
void ListarClientesSprintf(ALUNO aluno, int nQtdeAlunos, char *ptrCabecalho);


// Função de construção dos metodos da classe.
void Cons_Listar(ALUNO aluno, INFORMACAO info)
{
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens_Listar();
		Finaly_program = Funcao_Item_Escolhido_Menu_Listar(item, aluno, info);

	} while (Finaly_program);
}

// Função que seleciona o metodo pelo o item escolhido
//	Parâmetros:
//		Entrada: char ch_item: item de seleção do menu.
bool Funcao_Item_Escolhido_Menu_Listar(char item, ALUNO aluno, INFORMACAO info)
{ 
	
	switch (item)
	{
	case'0':
		CLS;
		cout << "FIM. " << endl;
		return false;
	case'1':
		CLS;
	
		ListarClientesSprintf(aluno,info.nQtd_Calouros, "LISTA #1");
		return true;
	case'2':
		CLS;
		
		return true;
	default:
		return true;
	}
}

// Função que mostra o menu LISTAR no console.
char Menu_Itens_Listar()
{
	CLS;

	char ch_item;
	cout << " <-----------------------------------[ Listar ]----------------------------->" << endl;
	cout << "\n\t" << "digite valor correspondente:" << endl;
	cout << "\n\t" << " " << endl;
	cout << "\n\t" << "                        1- Listar todos alunos (Normal)" << endl;
	cout << "\n\t" << "                        2- Listar outra forma" << endl;
	cout << "\n\t" << "                                                         0- Sair   " << endl;
	cout << " <--------------------------------------------------------------------------->" << endl;
	cout << "  --->{ ";

	cin >> ch_item;
	return ch_item;
}

// Função que lista um vetor de clientes
//	Parâmetros:
//		Entrada: CLIENTE *ptrVetClientes - ponteiro para o primeiro cliente do vetor
//				 int nQtdeClientes - quantidade de clientes no vetor
//				 char *ptrCabecalho - cabeçalho para a listagem dos clientes
void ListarClientesSprintf(ALUNO aluno,int nQtdeAlunos, char *ptrCabecalho)
{
	int i;											// indice e contador
	char cWork[200];                                // para o sprintf
	CLS;
	cout << "\n\t" << ptrCabecalho << endl;			// imprimir o cabeçalho
	cout << "Código         Nome                     Sexo        Nota" << endl;

	for (i = 0; i < 5; i++)
	{
		sprintf_s(cWork, sizeof(cWork), " % 5d  |  % -40s  |  %c  |  %d  ", i,
			aluno.vetNomes[i][0], aluno.vetSexo[i], aluno.vetNotas[i]);
		cout << cWork << endl;
		//"%5d  %-40s  %10.2"
	}

	PAUSE;
}
