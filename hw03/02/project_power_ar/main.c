#include <stdio.h>
#include "power.h"
#include "myPrint.h"

int main()
{
	printHello();
	printf("3 ^ 4 = %5.2f\n", power(3.0, 4));
	printBye();

	return 0;
}

