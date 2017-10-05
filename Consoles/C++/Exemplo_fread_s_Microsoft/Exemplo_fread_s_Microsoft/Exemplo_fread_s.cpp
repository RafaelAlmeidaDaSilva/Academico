#include <stdio.h>

#include <Windows.h>

#define BUFFERSIZE 30
#define DATASIZE 22
#define ELEMENTCOUNT 2
#define ELEMENTSIZE (DATASIZE/ELEMENTCOUNT)
#define FILENAME "FREAD.OUT"
#define PAUSE system("pause")

int main(void)
{
	FILE *stream;
	char list[30];
	int  i, numread, numwritten;

	for (i = 0; i < DATASIZE; i++)
		list[i] = (char)('z' - i);                 // Preenche o vetor com Alfabeto de tráz para frente.

	list[DATASIZE] = '\0';                         // Deixa o ultimo caracter nulo

	// Open file in text mode:
	if (fopen_s(&stream, FILENAME, "w+t") == 0)
	{
		// Write DATASIZE characters to stream 
		printf("Contents of buffer before write/read:\n\t%s\n\n", list);
		numwritten = fwrite(list, sizeof(char), DATASIZE, stream);
		printf("Wrote %d items\n\n", numwritten);
		fclose(stream);
	}
	else {
		printf("Problem opening the file\n");
		return -1;
	}

	if (fopen_s(&stream, FILENAME, "r+t") == 0)   {
		// Attempt to read in characters in 2 blocks of 11
		numread = fread_s(list, BUFFERSIZE, ELEMENTSIZE, ELEMENTCOUNT, stream);
		printf("Number of %d-byte elements read = %d\n\n", ELEMENTSIZE, numread);
		printf("Contents of buffer after write/read:\n\t%s\n", list);
		fclose(stream);
	}
	else {
		printf("File could not be opened\n");
		return -1;
	}

	PAUSE;
}