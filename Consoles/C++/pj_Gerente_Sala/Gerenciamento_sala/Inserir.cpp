//----------------------------------------------------[ PROJETO GERENCIAMENTO DE ALUNOS ]---------------------------------------------------------------
//---------[Classe (Inserir.cpp)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     23.03.16
// DATA ULT. ALT.:  25.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes

#include "Main.h"
#include "Colecao_Alunos.h"

char Menu_Itens_Inserir();
bool Funcao_Item_Escolhido_Menu_Inserir(char item, INFORMACAO info, ALUNO aluno);
void Inserir_Manualmente(ALUNO aluno, INFORMACAO info);
void inserir_Nota(int i, ALUNO aluno);
void inserir_Nome(int i, ALUNO aluno);
void inserir_Sexo(int i, ALUNO aluno);
void definir_Trono(int i, ALUNO aluno);
void inserir_Nome_Automatico(int i, ALUNO aluno);
void Inserir_Automatico(ALUNO aluno, INFORMACAO info);
void inserir_Nota_Automatico(int i, ALUNO aluno);
void inserir_Sexo_Automatico(int i, ALUNO aluno);
void qtd_calouros_inserir(INFORMACAO info);

// Função de construção dos metodos da classe.
void Cons_Inserir(ALUNO aluno, INFORMACAO info)
{
	bool Finaly_program = true;// false para sair.
	do{
		char item = Menu_Itens_Inserir();
		Finaly_program = Funcao_Item_Escolhido_Menu_Inserir(item, info, aluno);

	} while (Finaly_program);
}

// Função que seleciona o metodo pelo o item escolhido
//	Parâmetros:
//		Entrada: char ch_item: item de seleção do menu.
bool Funcao_Item_Escolhido_Menu_Inserir(char item, INFORMACAO info, ALUNO aluno)
{
	switch (item)
	{
	case'0':
		CLS;
		cout << "FIM. " << endl;
		return false;
	case'1':
		CLS;
		Inserir_Manualmente(aluno,info);
		return true;
	case'2':
		CLS;
		Inserir_Automatico(aluno, info);
		return true;
	default:
		return true;
	}
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

int i,									// indice e quantidade
nQtdeCalouros,                          // qtde de caloros que ira cantar hoje
nNotaTrono = -1,						// nota do calouro que esta no trono
nIndiceTrono;						    // indice do calouro que esta no trono

// METODO DE INSERIR MANUALMENTE:
void Inserir_Manualmente(ALUNO aluno, INFORMACAO info)
{
	cout << "\t INSERINDO MANUALMENTE " << endl;

	qtd_calouros_inserir(info);
	
	
	for (i = 0; i < nQtdeCalouros; i++)
	{   
		
		inserir_Nome(i, aluno);
		inserir_Sexo(i, aluno);
		inserir_Nota(i, aluno);
		definir_Trono(i, aluno);
	}


}

// SUB_METODOS DE INSERIR MENUALMENTE: 
void inserir_Nota(int i, ALUNO aluno)
{
	
	do
	{

		cout << "Nota entre " << NOTA_MINIMA << " e " << NOTA_MAXIMA << ": ";
		cin >> aluno.vetNotas[i];
	} while (aluno.vetNotas[i] < NOTA_MINIMA || aluno.vetNotas[i] > NOTA_MAXIMA);
}
void inserir_Nome(int i, ALUNO aluno)
{
	
	cout << "Nome do calouro de ordem [" << i + 1 << "]: ";
	cin.ignore(1, EOF);                                       // Ignora a letra ENTER anterior
	cin.getline(&aluno.vetNomes[i][0], EXTENSAO_NOME - 1, '\n');    // Nome com sobrenome

}
void inserir_Sexo(int i, ALUNO aluno)
{
	
	do
	{
		cout << "Sexo do aluno [" << &aluno.vetNomes[i][0] << "](M - Masculino e F - Feminino): ";
		cin >> aluno.vetSexo[i];
		aluno.vetSexo[i] = toupper(aluno.vetSexo[i]);                          // deixa os caracteres do VETOR SEXO

	} while (aluno.vetSexo[i] != MASCULINO && aluno.vetSexo[i] != FEMININO);
}


// METODO DE INSERIR AUTOMATICAMENTE:
void Inserir_Automatico(ALUNO aluno, INFORMACAO info)
{
	cout << "\t INSERINDO AUTOMATICAMENTE" << endl;
	qtd_calouros_inserir(info);
	for (i = 0; i < nQtdeCalouros; i++)
	{   
		
		inserir_Nome_Automatico(i,aluno);
		inserir_Nota_Automatico(i, aluno);
		inserir_Sexo_Automatico(i, aluno);
		definir_Trono(i, aluno);
	}
}

// SUB_METODOS DE INSERIR AUTOMATICAMENTE:
void inserir_Nota_Automatico(int i, ALUNO aluno)
{
		aluno.vetNotas[i] = 1 + (rand() % 10); // gera notas de 1 ~ 10
		cout << "Nota: " << aluno.vetNotas[i] << endl;
}
void inserir_Nome_Automatico(int i, ALUNO aluno)
{
	sprintf_s((aluno.vetNomes[i]), sizeof(aluno.vetNomes[i]), "ALUNO ALEATÓRIO n°[ %d ]", i + 1);
}
void inserir_Sexo_Automatico(int i, ALUNO aluno)
{
		if (i % 2 == 0)
		{ 
			aluno.vetSexo[i] = MASCULINO;
			cout << "SEXO: Masculino" << endl;
		} 
		else
		{
			aluno.vetSexo[i] = FEMININO;
			cout << "SEXO: Feminino" << endl;
		}
		
}

// METODO FAZ MARCAÇÃO DA QUANTIDADE DE ALUNOS QUE IRAM SE CADASTRAR:
void qtd_calouros_inserir(INFORMACAO info)
{
	do
	{
		cout << "Quantidade de calouros entre " << QTDE_MIN_CALOUROS
			<< " e " << QTDE_MAX_CALOUROS << endl
			<< "Ou 0(zero) para cancelar a execução do programa: ";
		cin >> nQtdeCalouros;
		if (nQtdeCalouros == 0)
			return;
	} while (nQtdeCalouros < QTDE_MIN_CALOUROS || nQtdeCalouros > QTDE_MAX_CALOUROS);

	info.nQtd_Calouros = nQtdeCalouros;

}
// METODO QUE DEFINE O MELHOR ALUNO 
void definir_Trono(int i, ALUNO aluno)
{
	// VERIFICAR se o calouro vai para o trono
	if (aluno.vetNotas[i] > nNotaTrono)
	{
		nNotaTrono = aluno.vetNotas[i];                                 // nota do calouro que esta indo para o trono
		nIndiceTrono = i;										  // indice do calouro que foi para o trono
	}
}
