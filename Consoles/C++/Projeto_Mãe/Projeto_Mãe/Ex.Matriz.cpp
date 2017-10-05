//----------------------------------------------------[ PROJETO MÃE ]---------------------------------------------------------------
//---------[Classe (Ex. Matriz)]>
//---------[Informações de Desenvolvimento]>
// DAT. INICIO:     16.03.16
// DATA ULT. ALT.:  16.03.16
// AUTOR:           Rafael Almeida da Silva 
// LOCAL:           Fatec de Mogi das Cruzes
// MOTIVO da Classe:
/*
- facilitar e organizar os exercicios praticados
em sala de aula juntamente com os praticados em casa.

*/
#include "HeadMae.h"

char Menu_Itens_Matriz();
bool Funcao_Item_Escolhido_MenuMatriz(char item);
char Menu_Itens();
void Exercicio1();
void Exercicio2();
void Exercicio3();
void Exercicio4();
void Exercicio5();
void Exercicio6();

int fatorial(int num);

void Cons_ExMatriz()
{
	bool Finaly_Matriz = true;
	do{
	char item = Menu_Itens_Matriz();
	Finaly_Matriz = Funcao_Item_Escolhido_MenuMatriz(item);
	} while (Finaly_Matriz);
}

bool Funcao_Item_Escolhido_MenuMatriz(char item)
{
	switch (item)
	{
	case'0':

		return false; // false para sair 
	case'1':
		CLS;
		Exercicio1();
		PAUSE;
		return true;
	case'2':
		CLS;
		Exercicio2();
		PAUSE;
		return true;
	case'3':
		CLS;
		Exercicio3();
		PAUSE;
		return true;
	case'4':
		CLS;
		Exercicio4();
		PAUSE;
		return true;
	case'5':
		CLS;
		Exercicio5();
		PAUSE;
		return true;
	case'6':
		CLS;
		Exercicio6();
		PAUSE;
		return true;
	case'7':
		CLS;
		cout << "\n Exercicio ainda NAO foi terminado!" << endl;
		PAUSE;
		return true;
	case'8':
		CLS;
		cout << "\n Exercicio ainda NAO foi terminado!"<<endl;
		PAUSE;
		return true;
	default:
		cout << "Valor Inválido!";
		PAUSE;
		return true;
	}
}

char Menu_Itens_Matriz()
{
	CLS;

	char ch_item;
	cout << "\n\t" << "<-----------------------------|EXEMPLOS: Matriz|-------------------->" << endl;
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


/*
1)	Criar uma matriz A de 2 linhas e 2 colunas do tipo inteiro
•	Solicitar para o usuário os valores para inserir na matriz A
•	Após a inserção dos valores, mostrar a matriz A
*/
void Exercicio1()
{
	
	int MatrizA[2][2];
	int i, i2;
	for (i = 0; i<2; i++)
	{

		for (i2 = 0; i2<2; i2++)
		{
			cout << "Digite um valor qualquer:";
			cin >> MatrizA[i][i2];
		}

	}


	for (i = 0; i<2; i++)
	{
		for (i2 = 0; i2<2; i2++)
		{
			cout << "\nLinha( " << i << ")" << " Coluna(" << i2 << ") = " << MatrizA[i][i2];
		}

	}



}
/*
2)	Criar uma matriz A 3x3 do tipo inteiro
	•	Solicitar p / o usuário os valores e inserí - los na matrizA
	•	Criar uma matrizB 3x3 do tipo inteiro
	•	Gravar na matrizB a transposta da matriz A
	•	Após  a inserção dos valores mostrar  as duas matrizes
*/
void Exercicio2()
{

	int MatA[3][3];
	int MatB[3][3];
	int i, i2;

	for (i = 0; i < 3; i++)
	{
		for (i2 = 0; i2 < 3; i2++)
		{
			cout << "Digite um valor para a Matriz: ";
			cin >> MatA[i][i2];
		}
	}

	for (i = 0; i < 3; i++)
	{
		for (i2 = 0; i2 < 3; i2++)
		{
			MatB[i][i2] = MatA[i][i2];
		}
	}
	
	cout << "\nMATRIZ A";
	cout << "\n------------------------";
	for (i = 0; i < 3; i++)
	{
		for (i2 = 0; i2 < 3; i2++)
		{
			cout << " \nLinha(" << i << ")" << " Coluna(" << i2 << ") =" << MatA[i][i2];
		}
	}

	cout << "\n\nMATRIZ B";
	cout << "\n------------------------";
	for (i = 0; i < 3; i++)
	{
		for (i2 = 0; i2 < 3; i2++)
		{
			cout << " \nLinha(" << i << ")" << " Coluna(" << i2 << ") =" << MatB[i][i2];
		}
	}

}

/*
3)	Criar uma matriz A de 3 linhas e 3 colunas do tipo inteiro
	•	Solicitar p/ o usuário os valores  para inserir na matriz A
	•	Criar um Vetor B de 3 elementos do tipo inteiro
	•	Gravar no vetor b a diagonal principal da matriz A
	•	Após a inserção do valores mostrar a matriz A e o vetor B

*/
void Exercicio3()
{
	int MatA[3][3];
	int VetA[3];
	int i, i2;

	for (i = 0; i<3; i++)
	{

		for (i2 = 0; i2<3; i2++)
		{
			cout << "Digite um valor qualquer: ";
			cin >> MatA[i][i2];
		}
	}

	for (i = 0; i<3; i++)
	{
		VetA[i] = MatA[i][i];
		cout << "\n" << VetA[i];
	}

	cout << "\n-----------------------------";
	for (i = 0; i<3; i++)
	{
		for (i2 = 0; i2<3; i2++)
		{
			cout << "\n" << MatA[i][i2];
		}
	}
}
/*
4)	Criar uma matriz A de 3 linhas e 3 colunas do tipo inteiro
•	Solicitar p/ o usuário os valores  para inserir na matriz A
•	Criar um Vetor B de 3 elementos do tipo inteiro
•	Gravar no vetor b a diagonal secundaria da matriz A
•	Após a inserção do valores mostrar a matriz A e o vetor B

*/

void Exercicio4()
{
	int MatA[3][3];
	int VetA[3];
	int i, i2;

	for (i = 0; i<3; i++)
	{

		for (i2 = 0; i2<3; i2++)
		{
			cout << "Digite um valor qualquer: ";
			cin >> MatA[i][i2];
		}
	}


	for (i2 = 0; i2<3; i2++)
	{
		int teste = 2;
		teste = teste - i2;
		VetA[i2] = MatA[i2][teste];

	}

	for (i = 0; i<3; i++)
	{
		cout << "\n" << VetA[i];
	}

	cout << "\n-----------------------------";
	for (i = 0; i<3; i++)
	{
		for (i2 = 0; i2<3; i2++)
		{
			cout << "\n" << MatA[i][i2];
		}
	}

}

/*

5)	Criar um matriz A 2x2 do tipo inteiro
•	Solicitar p/ o usuário os valores  inteiro positivo (consistir) e inserir na matriz A
•	Criar uma matrizB 2x2 do tipo inteiro
•	Gravar na matrizB o fatorial de cada elemento da matrizA
•	Mostrar as matrizes

*/

void Exercicio5()
{

	int MatA[2][2];
	int MatB[2][2];
	int i, i2;

	for (i = 0; i<2; i++)
	{
		for (i2 = 0; i2<2; i2++)
		{
			cout << "DIGITE um valor qualquer : ";
			cin >> MatA[i][i2];
		}
	}

	for (i = 0; i<2; i++)
	{
		for (i2 = 0; i2<2; i2++)
		{
			MatB[i][i2] = fatorial(MatA[i][i2]);
		}
	}

	cout << "\nMATRIZ A ";
	cout << "\n---------------------------------------";
	for (i = 0; i<2; i++)
	{
		for (i2 = 0; i2<2; i2++)
		{
			cout << "\n" << MatA[i][i2];
		}
	}

	cout << "\n\nMATRIZ B ";
	cout << "\n---------------------------------------";
	for (i = 0; i<2; i++)
	{
		for (i2 = 0; i2<2; i2++)
		{
			cout << "\n" << MatB[i][i2];
		}
	}
}


int fatorial(int num)
{
	if (num == 0)
	{
		return 1;
	}
	else{
		return num*fatorial(num - 1);
	}
}

/*6)	Criar um vetor de 10 elementos e uma matriz de 10 linhas por 10 colunas
•	 solicitar para o usuário digitar valores no intervalo de 1 a 10 e inserir no vetor, 
•	após a inserção no vetor, ler o vetor e para cada elemento lido calcular a tabuada e inserir na matriz.
•	 Ao final mostrar o elemento do vetor e a tabuada correspondente que esta na matriz

*/

void Exercicio6()
{
	int vetA[10];
	int matA[10][10];
	int i, i2;

	for (i = 0; i<10; i++)
	{
		cout << "Digite um valor para o vetor[" << i << "]: ";
		cin >> vetA[i];
	}
	
	cout << "\n---------------------------------------\n";

	for (i = 0; i<10; i++)
	{
		for (i2 = 0; i2<10; i2++)
		{
			matA[i][i2] = vetA[i2] * (i + 1);
		}

	}

	for (i = 0; i<10; i++)
	{
		for (i2 = 0; i2<10; i2++)
		{
			cout << " " << matA[i][i2];
		}
		cout << "\n";
	}
}

/*
7)	Criar uma matriz para o controle de faltas de uma turma, a turma tem no Maximo 30 alunos e o semestre de 5 meses.
•	Solicitar as faltas de cada aluno e inserir na matriz,
•	Criar um vetor de 30 elementos do tipo inteiro
•	Calcular a média de faltas de cada aluno e inserir no vetor
•	Ao final mostrar as faltas e a média correspondente às faltas

*/

/*
8)	Criar  uma matriz A de mesma dimensão que B ( 3 x 3) do tipo inteiro. Efetuar a soma matricial A + B e armazenar o resultado na matriz C.

*/