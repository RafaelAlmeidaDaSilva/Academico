// ************************************************************
//   Exemplo de uso de arquivo texto
//   Este programa grava um arquivo texto
// ************************************************************
#include "Bibliotecas_Exemplos.h"

void main()
{
	FILE *arq;
	int i;
	int result;

	 // Cria um arquivo texto para grava��o
	if (fopen_s(&arq, CAMINHO_ARQUIVO, "wt") == NULL) // Se n�o conseguiu criar
	{
		printf("Problemas na CRIACAO do arquivo\n");
		return;
	}
	for (i = 0; i<10; i++)
	{
		// A funcao 'fprintf' devolve o n�mero de bytes gravados 
		// ou EOF se houve erro na grava��o
		result = fprintf(arq, "Linha %d\n", i);
		if (result == EOF)
			printf("Erro na Gravacao\n");
	}
	fclose(arq);
}