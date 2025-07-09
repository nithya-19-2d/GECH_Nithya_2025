#include <stdio.h>

int main()
{
    int num, i = 2, count = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    while (i < num)
    {
        if (num % i == 0)
        {
            count++;
        }
        i++;
    }

    if (num <= 1 || count > 0)
        printf("%d is not a prime number.\n", num);
    else
        printf("%d is a prime number.\n", num);

    return 0;
}