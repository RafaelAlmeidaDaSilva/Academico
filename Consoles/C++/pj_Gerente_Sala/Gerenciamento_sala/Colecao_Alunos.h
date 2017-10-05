//----------------------------------------------------[ PROJETO GERENCIAMENTO DE ALUNOS ]---------------------------------------------------------------
//---------[Classe (Coleção.h)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     23.03.16
// DATA ULT. ALT.:  23.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes

#define QTDE_MAX_CALOUROS	50
#define QTDE_MIN_CALOUROS	4
#define EXTENSAO_NOME		40	
#define MASCULINO			'M'
#define FEMININO			'F'
#define NOTA_MINIMA			0
#define NOTA_MAXIMA			10

typedef struct tagALUNO
{
	//INFORMAÇÕES DO ALUNO: 
	int vetNotas[QTDE_MAX_CALOUROS];			           // vetor de notas dos calouros
	char vetSexo[QTDE_MAX_CALOUROS];			           // vetor de sexos dos calouros
	char vetNomes[QTDE_MAX_CALOUROS][EXTENSAO_NOME];       // vetor de nomes dos calouros
	                                                   
												
}ALUNO;

typedef struct tagIDADE
{  
	//INFORMAÇÕES DE DATA:
	int vetDia[QTDE_MAX_CALOUROS];
	int vetMes[QTDE_MAX_CALOUROS];
	int vetAno[QTDE_MAX_CALOUROS];
}IDADE;

typedef struct tagINFORMACAO
{
	int nQtd_Calouros;
}INFORMACAO;