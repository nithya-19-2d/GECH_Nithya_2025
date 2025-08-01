#include <stdio.h>

int main()
{
    int num, i = 1, fact = 1;
    printf("Enter the number : ");
    scanf("%d", &num);

    for (i; i <= num; i++)
    {
        fact *= i;
    }

    printf("the fact of %d is = %d", num, fact);
}