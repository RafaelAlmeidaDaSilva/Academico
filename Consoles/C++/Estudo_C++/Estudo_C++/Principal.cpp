//----------------------------------------------------[ PROJETO ESTUDO C++ ]---------------------------------------------------------------
//---------[Classe (Menu.cpp)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     23.03.16
// DATA ULT. ALT.:  23.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes

#include "Main.h"

//PROTOTIPOS (MENU PRINCIPAL)
void Cons_Menu();
char Menu_Itens();
bool Funcao_Item_Escolhido_Menu(char item);

//PROTOTIPOS (INSERIR)
void Cons_Inserir();
char Menu_Itens_Inserir();
bool Funcao_Item_Escolhido_Menu_Inserir(char item);
void Inserir_Alunos_Automaticamente();
void Inserir_Alunos_Manualmente();
int qtd_Inserir();

//PROTOTIPOS (LISTAR)
void Cons_Listar();
char Menu_Itens_Listar();
bool Funcao_Item_Escolhido_Menu_Listar(char item);
void Listar_Todos_Alunos();
void Listar_Todos_Alunos_Masculino();
void Listar_Todos_Alunos_Feminino();

//PRTÓTIPOS (ORDENAR)
void Cons_Ordenar();
char Menu_Itens_Ordenar();
bool Funcao_Item_Escolhido_Menu_Ordenar(char item);
void BubbleAlfabetico(ALUNO *ptrVetBubble, int NQTCalouros);


//----------------------------------------------------------------[MENU PRINCIPAL]----------------------------------------------------------->
ALUNO stAluno,
ptrStAluno = stAluno,
vetAlunos[QTDE_MAX_ALUNO],
 *ptrVetAlunos = vetAlunos;

// Função de construção dos metodos da classe.
void Cons_Menu()
{
	
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens();
		Finaly_program = Funcao_Item_Escolhido_Menu(item);

	} while (Finaly_program);
}

// Função que mostra o menu principal no console.
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

// Função que seleciona o metodo pelo o item escolhido
//	Parâmetros:
//		Entrada: char ch_item: item de seleção do menu.
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
		Cons_Inserir();
		return true;
	case'2':
		Cons_Listar();
		return true;
	case'3':
		Cons_Ordenar();
		return true;
	case'4':
		cout << "Função escolhida foi a do 4" << endl;
		return true;
	default:
		return true;
	}
}


//---------------------------------------------------------------[MENU INSERIR]---------------------------------------------------------->


//VARIAVEIS GLOBAIS
int nQtdeAlunos;                         // qtde de alunos que iram ser cadastrados

// Função de construção dos metodos da classe.
void Cons_Inserir()
{
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens_Inserir();
		Finaly_program = Funcao_Item_Escolhido_Menu_Inserir(item);

	} while (Finaly_program);
}

// Função que mostra o menu de Inserir no console.
char Menu_Itens_Inserir()
{
	CLS;

	char ch_item;
	cout << " <-----------------------------------[ INSERIR ]----------------------------->" << endl;
	cout << "\n\t" << "digite valor correspondente:                                       " << endl;
	cout << "\n\t" << "                                                                   " << endl;
	cout << "\n\t" << "                        1- Inserir Manualmente                     " << endl;
	cout << "\n\t" << "                        2- Inserir Automatico                      " << endl;
	cout << "\n\t" << "                                                         0- Sair   " << endl;
	cout << " <--------------------------------------------------------------------------->" << endl;
	cout << "  --->{ ";

	cin >> ch_item;
	return ch_item;
}

// Função que seleciona o metodo pelo o item escolhido
//	Parâmetros:
//		Entrada: char ch_item: item de seleção do menu.
bool Funcao_Item_Escolhido_Menu_Inserir(char item)
{
	switch (item)
	{
	case'0':
		CLS;
		cout << "FIM. " << endl;
		return false;
	case'1':
		CLS;
		cout <<"<--------------------[INSERIR MANUALMENTE]----------------:" << endl;
		cout << "" << endl;
		Inserir_Alunos_Manualmente();
		return true;
	case'2':
		CLS;
		cout <<"<------------------[INSERIR AUTOMATICAMENTE]--------------:" << endl;
		cout << "" << endl;
		Inserir_Alunos_Automaticamente();		
		return true;
	default:
		return true;
	}
}

// FUNÇÃO que inseri Manualmente os dados dos alunos
void Inserir_Alunos_Manualmente()
{
	nQtdeAlunos = qtd_Inserir();
	int i;
	char str_i;
	for (i = 0; i < nQtdeAlunos ; i++)
	{

		// CODIGO
		(ptrVetAlunos + i)->nCodigo = i + 1;
		
		// NOTA 
		do
		{
			cout << "digite NOTA entre " << NOTA_MINIMA << " e " << NOTA_MAXIMA << ": ";
			cin >> (ptrVetAlunos + i)-> nNota;
		} while ((ptrVetAlunos + i)->nNota < NOTA_MINIMA || (ptrVetAlunos + i)->nNota > NOTA_MAXIMA);
		
		// NOME
		cout << "Nome do calouro de ordem [" << i + 1 << "]: ";
		cin.ignore(1, EOF);                                       // Ignora a letra ENTER anterior
		cin.getline((ptrVetAlunos + i)->cNome, EXTENSAO_NOME - 1, '\n');    // Nome com sobrenome
			
		// SEXO
		do
		{
			cout << "Sexo do aluno [" << (ptrVetAlunos + i)->cNome << "](M - Masculino e F - Feminino): ";
			cin >> (ptrVetAlunos + i)->cSexo;
			(ptrVetAlunos + i)->cSexo = toupper((ptrVetAlunos + i)->cSexo);  // deixa os caracter do Maisculo

		} while ((ptrVetAlunos + i)->cSexo != MASCULINO && (ptrVetAlunos + i)->cSexo != FEMININO);

		CLS;
	}

}

// FUNÇÃO que inseri os alunos de uma forma automatica
void Inserir_Alunos_Automaticamente()
{
	nQtdeAlunos = qtd_Inserir();
	int i;
	char str_i[200];
	for (i = 0; i < nQtdeAlunos; i++)
	{
	
		_itoa_s(i + 1, str_i, sizeof(str_i), 10);								// converte i para string para ser concatenado
		(ptrVetAlunos + i)->nCodigo = i + 1;									// inseri o codigo no vetor
		(ptrVetAlunos + i)->nNota = 1 + rand() % 10;							// nota aleatoria 0-10
		(ptrVetAlunos + i)->cSexo = MASCULINO;									// Masculino automatico
		strcpy_s((ptrVetAlunos + i)->cNome, " NOME ALUNO: n° ");				// Dar nome ficticio
		strcat_s((ptrVetAlunos + i)->cNome, sizeof(ptrStAluno.cNome), str_i);   // concatena a ordem do cliente

	}

}

// FUNÇÂO que traz a quantidade desejada pelo usuário
int qtd_Inserir()
{ 
	int qtd;
	do
	{
		printf_s("digite quantidade de alunos que deseja cadastrar entre(%d ~ %d): ",QTDE_MIN_ALUNO,QTDE_MAX_ALUNO);
		cin >> qtd;
		if (qtd == 0)
			break;
	} while (qtd < QTDE_MIN_ALUNO || qtd> QTDE_MAX_ALUNO);

	return qtd;
}


//--------------------------------------------------------------------[MENU LISTAR]------------------------------------------------------->

// Função de construção dos metodos da classe.
void Cons_Listar()
{
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens_Listar();
		Finaly_program = Funcao_Item_Escolhido_Menu_Listar(item);

	} while (Finaly_program);
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
	cout << "\n\t" << "                        2- Listar todos alunos do sexo M" << endl;
	cout << "\n\t" << "                        3- Listar todos alunos do sexo F" << endl;
	cout << "\n\t" << "                                                         0- Sair   " << endl;
	cout << " <--------------------------------------------------------------------------->" << endl;
	cout << "  --->{ ";

	cin >> ch_item;
	return ch_item;
}

// Função que seleciona o metodo pelo o item escolhido
//	Parâmetros:
//		Entrada: char ch_item: item de seleção do menu.
bool Funcao_Item_Escolhido_Menu_Listar(char item)
{

	switch (item)
	{
	case'0':
		CLS;
		cout << "FIM. " << endl;
		return false;
	case'1':
		CLS;
		Listar_Todos_Alunos();
		return true;
	case'2':
		CLS;
		Listar_Todos_Alunos_Masculino();
		return true;
	case'3':
		CLS;
		Listar_Todos_Alunos_Feminino();
		return true;
	default:
		return true;
	}
}

void Listar_Todos_Alunos()
{
	int i;											// indice e contador
	char cWork[200];                                // para o sprintf
	CLS;
	cout << "\n\t [LISTA TODOS ALUNOS CADASTRADOS]:" << endl;			// imprimir o cabeçalho
	cout << "Código         Nome            Sexo        Nota" << endl;

	for (i = 0; i < nQtdeAlunos; i++)
	{
		sprintf_s(cWork, sizeof(cWork), " % 5d  |  % -40s  |  %c  |  %d  ",	ptrVetAlunos,
			(ptrVetAlunos + i)->cNome, (ptrVetAlunos + i)->cSexo, (ptrVetAlunos + i)->nNota);
		cout << cWork << endl;
		
	}

	PAUSE;
}

void Listar_Todos_Alunos_Masculino()
{
	int i;											// indice e contador
	char cWork[200];                                // para o sprintf
	CLS;
	cout << "\n\t [LISTA TODOS ALUNOS DE SEXO (M) CADASTRADOS]:" << endl;			// imprimir o cabeçalho
	cout << "Código         Nome            Sexo        Nota" << endl;

	for (i = 0; i < nQtdeAlunos; i++)
	{
		if ((ptrVetAlunos + i)->cSexo == MASCULINO)
		{
		sprintf_s(cWork, sizeof(cWork), " % 5d  |  % -40s  |  %c  |  %d  ", (ptrVetAlunos + i)->nCodigo,
			(ptrVetAlunos + i)->cNome, (ptrVetAlunos + i)->cSexo, (ptrVetAlunos + i)->nNota);
		cout << cWork << endl;
		}
	}

	PAUSE;
}

void Listar_Todos_Alunos_Feminino()
{
	int i;											// indice e contador
	char cWork[200];                                // para o sprintf
	CLS;
	cout << "\n\t [LISTA TODOS ALUNOS DE SEXO (F) CADASTRADOS]:" << endl;			// imprimir o cabeçalho
	cout << "Código         Nome            Sexo        Nota" << endl;

	for (i = 0; i < nQtdeAlunos; i++)
	{
		if ((ptrVetAlunos + i)->cSexo == FEMININO)
		{
			sprintf_s(cWork, sizeof(cWork), " % 5d  |  % -40s  |  %c  |  %d  ", (ptrVetAlunos + i)->nCodigo,
				(ptrVetAlunos + i)->cNome, (ptrVetAlunos + i)->cSexo, (ptrVetAlunos + i)->nNota);
			cout << cWork << endl;
		}
	}

	PAUSE;
}

//-------------------------------------------------------------------[MENU ORDENAR]------------------------------------------------------->

// Função de construção dos metodos da classe.
void Cons_Ordenar()
{
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens_Ordenar();
		Finaly_program = Funcao_Item_Escolhido_Menu_Ordenar(item);

	} while (Finaly_program);
}

// Função que mostra o menu LISTAR no console.
char Menu_Itens_Ordenar()
{
	CLS;

	char ch_item;
	cout << " <-----------------------------------[ Ordenar ]----------------------------->" << endl;
	cout << "\n\t" << "digite valor correspondente:" << endl;
	cout << "\n\t" << " " << endl;
	cout << "\n\t" << "                        1- Ordenar Alfabeticamente" << endl;
	cout << "\n\t" << "                        2- Ordenar por pontuação de Nota" << endl;
	cout << "\n\t" << "                                                         0- Sair   " << endl;
	cout << " <--------------------------------------------------------------------------->" << endl;
	cout << "  --->{ ";

	cin >> ch_item;
	return ch_item;
}

// Função que seleciona o metodo pelo o item escolhido
//	Parâmetros:
//		Entrada: char ch_item: item de seleção do menu.
bool Funcao_Item_Escolhido_Menu_Ordenar(char item)
{

	switch (item)
	{
	case'0':
		CLS;
		cout << "FIM. " << endl;
		return false;
	case'1':
		CLS;
		BubbleAlfabetico(vetAlunos,nQtdeAlunos);
		return true;
	case'2':
		CLS;
		return true;
	default:
		return true;
	}
}


void BubbleAlfabetico(ALUNO *ptrVetBubble, int NQTCalouros)
{
	int nAxuxiliar,													// para trocar de posicao a nota
		i;															// indice e contador

	char cAuxiliar,													// Para trocar de de sexo
		cAuxiliarNome[EXTENSAO_NOME];								// Para auxiliar na troca de posicao dos nomes

	bool flgHouveTroca;												//true indica que houve troca

	do
	{
		flgHouveTroca = false;										//nao houve troca ainda

		for (i = 0; i < NQTCalouros - 1; i++)						//loop de comparacao dois a dois nomes
		{
			if (strcmp((ptrVetBubble + i)->cNome, (ptrVetBubble + (i+1))->cNome) > 0)	//fora de ordem?
			{	
				//trocar de posicoes porque fora de ordem
				
				//ORDENA NOME
				strcpy_s(cAuxiliarNome, EXTENSAO_NOME, (ptrVetBubble + i)->cNome);				            //Salva elemento[i]

				*(ptrVetBubble + i)->cNome = stAluno.cNome[i + 1];

				strcpy_s((ptrVetBubble + i)->cNome, EXTENSAO_NOME, cAuxiliarNome);						    //troca o elemento[i]

				//ORDENA NOTA
				nAxuxiliar = (ptrVetBubble + i)->nNota;														//salva o elemtno[i]

				(ptrVetBubble + i)->nNota = (ptrVetBubble + (i + 1))->nNota;								//troca o elemento[i+1]

				(ptrVetBubble + (i + 1))->nNota = nAxuxiliar;												//troca o elemento[i]

			     //ORDENA SEXO
				cAuxiliar = (ptrVetBubble + i)->cSexo;														//salva o elemento[i]

				(ptrVetBubble + i)->cSexo = (ptrVetBubble + (i + 1))->cSexo;								//troca o elemento [i+1]

				(ptrVetBubble + (i + 1))->cSexo = cAuxiliar;											    //troca o elemento[i]

				 //ORDENA CODIGO
				nAxuxiliar = (ptrVetBubble + i)->nCodigo;
				
				(ptrVetBubble + i)->nCodigo = (ptrVetBubble + (i + 1))->nCodigo;

				(ptrVetBubble + (i + 1))->nCodigo = nAxuxiliar;

				flgHouveTroca == true;								//indica que houve troca
			}//if
		}//for i
	} while (flgHouveTroca);										//enquanto flghouvetroca == true
} //BubbleAlfabetico