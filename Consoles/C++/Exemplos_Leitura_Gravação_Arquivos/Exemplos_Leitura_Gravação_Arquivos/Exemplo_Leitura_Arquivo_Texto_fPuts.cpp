#include "Bibliotecas_Exemplos.h"

void main()
{
	char Str[100];
	FILE *arq;
	int result;

	fopen_s(&arq, CAMINHO_ARQUIVO, "wt");  // Cria um arquivo texto para gravação
	if (arq == NULL) // Se não conseguiu criar
	{
		printf("Problemas na CRIACAO do arquivo\n");
		return;
	}
	strcpy(Str, "Linha de teste");
	result = fputs(Str, arq);
	if (result == EOF)
		printf("Erro na Gravacao\n");
	fclose(arq);
}