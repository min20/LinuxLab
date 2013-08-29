// ****
// * 131048 LEE GyeongMin 
// ****

#include <stdio.h>

void printMultiplTable(void);

int main(void) {
	printMultiplTable();

	return 0;
}

void printMultiplTable(void) {
	int row, column;

	for (row = 1 ; row < 10 ; row++) {
		for (column = 1 ; column < 10 ; column++) {
			printf("%2d ", row * column);
		}
		printf("\n");
	}
}
