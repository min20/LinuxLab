#include <stdio.h>
#include "my.h"

int main(void) {
	printHello();
	printf("3 ^ 4 = %5.2f\n", power(3.0, 4));
	printBye();

	return 0;
}
