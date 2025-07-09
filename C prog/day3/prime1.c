#include <stdio.h>

int main()
{
    int num, i, count = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    for (i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            count++;
        }
    }

    if (num <= 1 || count > 0)
        printf("%d is not a prime number.\n", num);
    else
        printf("%d is a prime number.\n", num);

    return 0;
}