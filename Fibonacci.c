#include <stdio.h>

int main()
{
    int fib = 0;
    printf("Ingrese el numero Fibonacci deseado: ");
    scanf("%d", &fib);

    int a = 0;
    int b = 1;
    int c = 0;

    for(int i=0; i<fib-1; i++)
    {
        c = a+b;
        a = b;
        b = c;
    }

    printf("El numero Fibonacci es: %d", c);

    return 0;
}
