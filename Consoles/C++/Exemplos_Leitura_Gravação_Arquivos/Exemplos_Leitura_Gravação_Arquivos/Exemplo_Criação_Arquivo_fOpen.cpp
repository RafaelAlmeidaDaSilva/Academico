// Programa de exemplo de grava��o e escrita 
// classe: Cria��o de Arquivo texto

#include "Bibliotecas_Exemplos.h"

void main(void)
{

	FILE *arq;
	int result;
	char Str[50];

 
	if (fopen_s(&arq, CAMINHO_ARQUIVO, "wt") != 0)		// Abre escrita Bin�ria, se retorno for diferente de 0 entao � ->[ERRO]
	{
		cout << "Erro de abertura!" << endl;
		PAUSE;											// PAUSA o terminal, evitando a finaliza��o
		return;											// Finaliza MAIN()
	}
	else
	{
		printf("Arquivo criado com sucesso!\n");
		PAUSE;
		return;
	}

	
}