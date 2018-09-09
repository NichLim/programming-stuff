#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num1, num2, soma = 0;
    printf("Digite o primeiro numero: !\n");
    scanf("%d", &num1);
    printf("Digite o segundo numero: !\n");
    scanf("%d", &num2);
    soma = (num1 + num2);
    printf("A soma dos dois numeros e: %d \n", soma);
    return 0;
}
