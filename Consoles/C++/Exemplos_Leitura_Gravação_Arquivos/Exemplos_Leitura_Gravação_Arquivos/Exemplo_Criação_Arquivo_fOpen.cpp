// Programa de exemplo de gravação e escrita 
// classe: Criação de Arquivo texto

#include "Bibliotecas_Exemplos.h"

void main(void)
{

	FILE *arq;
	int result;
	char Str[50];

 
	if (fopen_s(&arq, CAMINHO_ARQUIVO, "wt") != 0)		// Abre escrita Binária, se retorno for diferente de 0 entao é ->[ERRO]
	{
		cout << "Erro de abertura!" << endl;
		PAUSE;											// PAUSA o terminal, evitando a finalização
		return;											// Finaliza MAIN()
	}
	else
	{
		printf("Arquivo criado com sucesso!\n");
		PAUSE;
		return;
	}

	
}