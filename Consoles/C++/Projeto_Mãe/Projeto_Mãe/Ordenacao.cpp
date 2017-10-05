
//----------------------------------------------------[ PROJETO M�E ]---------------------------------------------------------------
//---------[Classe (Ordem)]>
//---------[Informa��es de Desenvolvimento]>
// DAT. INICIO:     16.03.16
// DATA ULT. ALT.:  16.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
// PROFESSOR ;      Jos� Carlos Bortot 
// MOTIVO da Classe:


/*
	- Classe que permitir� ordernar valores dentro de um vetor.
*/
#include "HeadMae.h"

// Fun��o que classifica um vetor de inteiras
//	Par�metros:
//		Entrada: int nVetor[] - endere�o da primeira inteira do vetor de inteiras
//				 int nQtde - quantidade de inteiras do vetor
//				 bool flgOrdem - indica a ordem de classifica��o
//									true - indica ordem crescente
//									false - indica ordem decrescente

void BubbleSort(int nVetor[], int nQtde, bool flgOrdem)
{
	int i,									// �ndice e contador
		nTrabalho;							// para auxiliar nas trocas de posi��es
	bool flgHouveTroca;						// true - indica que houve troca
	// algoritmo de classifica��o de D. Flores
	do
	{
		flgHouveTroca = false;				// n�o houve troca ainda
		// loop de compara��o duas a duas
		for (i = 0; i < nQtde - 1; i++)
		{
			if (flgOrdem == true && nVetor[i] > nVetor[i + 1] ||
				!flgOrdem && nVetor[i] < nVetor[i + 1])	// fora de ordem?
			{	// est�o fora de ordem, fazer a troca de posi��o
				nTrabalho = nVetor[i];		// salva o elem[i]
				nVetor[i] = nVetor[i + 1];	// elem[i + 1] trocou de posi��o
				nVetor[i + 1] = nTrabalho;	// elem[i] trocou de posi��o
				flgHouveTroca = true;		// indica que houve troca
			}
		} // for i
	} while (flgHouveTroca == true);			// fa�a enquanto houver troca de posi��o (while(flgHouveTroca));
}
