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

	 // Cria um arquivo texto para gravação
	if (fopen_s(&arq, CAMINHO_ARQUIVO, "wt") == NULL) // Se nào conseguiu criar
	{
		printf("Problemas na CRIACAO do arquivo\n");
		return;
	}
	for (i = 0; i<10; i++)
	{
		// A funcao 'fprintf' devolve o número de bytes gravados 
		// ou EOF se houve erro na gravação
		result = fprintf(arq, "Linha %d\n", i);
		if (result == EOF)
			printf("Erro na Gravacao\n");
	}
	fclose(arq);
}