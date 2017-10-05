//----------------------------------------------------[ PROJETO MÃE ]---------------------------------------------------------------
//---------[Classe (Ex. Vetor)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     16.03.16
// DATA ULT. ALT.:  16.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
// PROFESSOR ;      José Carlos Bortot 
// MOTIVO da Classe:
/*

- facilitar e organizar os exercicios praticados
em sala de aula juntamente com os praticados em casa.

*/
#include "HeadMae.h";
bool Funcao_Item_Escolhido_MenuVetor(char item);
char Menu_Itens_Vetor();
void ListaVetorInteiras(int vetInteiras[], int nQtde);

#define QTDE_INTEIRAS							1000
#define QTDE_POR_LINHA							7
#define QTDE_LINHAS								10
#define QTDE_COLUNAS							31


void Cons_ExVetor()
{

	bool Finaly_Vetor = true;
	do{
		char item = Menu_Itens_Vetor();
		Finaly_Vetor = Funcao_Item_Escolhido_MenuVetor(item);
	} while (Finaly_Vetor);
}

bool Funcao_Item_Escolhido_MenuVetor(char item)
{
	switch (item)
	{
	case'0':

		return false; // false para sair 
	case'1':
		
		PAUSE;
		return true;
	case'2':
		
		PAUSE;
		return true;
	case'3':
		
		PAUSE;
		return true;
	case'4':
		
		PAUSE;
		return true;
	case'5':
		
		PAUSE;
		return true;
	case'6':
		
		PAUSE;
		return true;
	case'7':
		
		PAUSE;
		return true;
	case'8':
		cout << "\n Exercicio ainda NAO foi terminado!" << endl;
		PAUSE;
		return true;
	default:
		cout << "Valor Inválido!";
		PAUSE;
		return true;
	}
}

char Menu_Itens_Vetor()
{

	CLS;

	char ch_item;
	
	cout << "\n\t" << "<-----------------------------|EXEMPLOS: Vetor|--------------------->" << endl;
	cout << "\n\t" << "digite o número correspondente:                                    ->" << endl;
	cout << "\n\t" << "<- 1 - Ex.1                                                        ->" << endl;
	cout << "\n\t" << "<- 2 - Ex.2                                                        ->" << endl;
	cout << "\n\t" << "<- 3 - Ex.3                                                        ->" << endl;
	cout << "\n\t" << "<- 4 - Ex.4                                                        ->" << endl;
	cout << "\n\t" << "<- 5 - Ex.5                                                        ->" << endl;
	cout << "\n\t" << "<- 6 - Ex.6                                                        ->" << endl;
	cout << "\n\t" << "<- 7 - Ex.7                                                        ->" << endl;
	cout << "\n\t" << "<- 8 - Ex.8                                                        ->" << endl;
	cout << "\n\t" << "<- 0 - Sair                                                        ->" << endl;
	cout << "<--------------------------------------------------------------------------->" << endl;
	cout << "--->{ ";

	cin >> ch_item;
	return ch_item;
}
//Variaveis Utilizadas nos Exemplos
char vetNomes[QTDE_LINHAS][QTDE_COLUNAS];				// vetor bidimensionala
float fVetor[] = { (float)100.45, (float)300.67, (float)1000.0, (float)2345.48, (float)5678.899 },
fValor = (float) 4567.9876;
double dVetor[10] = { 4567.89, 45890.93 };
int nVetor[] = { 40, 89, 50, 55, 90, 45, 89, 100 },
i = 100, j = 0,											// contadores e indices
nIntVetor[QTDE_INTEIRAS],								// vetor de inteiras sem inicializar
nVetorCOpia[QTDE_INTEIRAS];								// vetor cópia do nIntVetor
char cVetor[] = { 'A', 'C', 'G', '>', 0x27, 0x5a, 0x41, 0x30, 0x39 },
cNome[] = "Jose Carlos\xA7 Bortot";
char cComplemento[] = " Professor de Linguagem de Programação",
cTrabalho[200];

void Ex_1()
{
	cout << "cNome=" << cNome << endl;
	cout << "cVetor=";
	for (i = 0; i < sizeof(cVetor); i++)
		cout << cVetor[i];
	cout << endl;
	PAUSE;
}

void Ex_2()
{

	cout << "nVetor=";
	for (i = 0; i < 8; i++)
		cout << nVetor[i] << " ";
	cout << endl;
	PAUSE;
}

void Ex_3()
{

	// loop para inicializar o vetor com valores segundo uma fórmula
	for (i = 0; i < QTDE_INTEIRAS; i++)
		nIntVetor[i] = i * 3 + 4;				// preenche o vetor
	cout << "\tListagem do vetor de inteiras" << endl;
	ListaVetorInteiras(nIntVetor, QTDE_INTEIRAS);

}

void Ex_4()
{
	
	// preencher o vetor de inteiras com números aleatórios (pseudo randômico)
	srand(237);									// estabelecer a semente randômica
	for (i = 0; i < QTDE_INTEIRAS; i++)			// loop de preenchimento
	{
		nIntVetor[i] = rand();					// preenche com uma inteira de 0 a 32k
		// tornar negativa a inteira sorteada por mais um sorteio
		if (rand() % 2 == 1)						// tornar negativo?
			nIntVetor[i] *= -1;					// torna negativo o que foi sorteado
	}
	
	cout << "\tListagem do vetor de inteira Aleatorias" << endl;
	ListaVetorInteiras(nIntVetor, QTDE_INTEIRAS);
}

void Ex_5()
{



}

void ListaVetorInteiras(int vetInteiras[], int nQtde)
{
	int i, j;										// indices e contadores
	// loop para listar as inteiras
	for (i = 0; i < nQtde;)							// loop de todas
	{
		for (j = 0; j < QTDE_POR_LINHA; j++, i++)	// loop de listagem por linha
		{
			if (i == nQtde)							// listou todas?
				break;								// cai fora do for j
			cout << vetInteiras[i] << '\t';
		} // for j
		cout << endl;								// pula de linha
	} // for i
	PAUSE;
}