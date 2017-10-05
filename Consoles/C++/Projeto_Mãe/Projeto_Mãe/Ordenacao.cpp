
//----------------------------------------------------[ PROJETO MÃE ]---------------------------------------------------------------
//---------[Classe (Ordem)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     16.03.16
// DATA ULT. ALT.:  16.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
// PROFESSOR ;      José Carlos Bortot 
// MOTIVO da Classe:


/*
	- Classe que permitirá ordernar valores dentro de um vetor.
*/
#include "HeadMae.h"

// Função que classifica um vetor de inteiras
//	Parâmetros:
//		Entrada: int nVetor[] - endereço da primeira inteira do vetor de inteiras
//				 int nQtde - quantidade de inteiras do vetor
//				 bool flgOrdem - indica a ordem de classificação
//									true - indica ordem crescente
//									false - indica ordem decrescente

void BubbleSort(int nVetor[], int nQtde, bool flgOrdem)
{
	int i,									// índice e contador
		nTrabalho;							// para auxiliar nas trocas de posições
	bool flgHouveTroca;						// true - indica que houve troca
	// algoritmo de classificação de D. Flores
	do
	{
		flgHouveTroca = false;				// não houve troca ainda
		// loop de comparação duas a duas
		for (i = 0; i < nQtde - 1; i++)
		{
			if (flgOrdem == true && nVetor[i] > nVetor[i + 1] ||
				!flgOrdem && nVetor[i] < nVetor[i + 1])	// fora de ordem?
			{	// estão fora de ordem, fazer a troca de posição
				nTrabalho = nVetor[i];		// salva o elem[i]
				nVetor[i] = nVetor[i + 1];	// elem[i + 1] trocou de posição
				nVetor[i + 1] = nTrabalho;	// elem[i] trocou de posição
				flgHouveTroca = true;		// indica que houve troca
			}
		} // for i
	} while (flgHouveTroca == true);			// faça enquanto houver troca de posição (while(flgHouveTroca));
}
