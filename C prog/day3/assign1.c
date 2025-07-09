#include <stdio.h>

int factorial(int n)
{
    int fact = 1;
    for (int i = 1; i <= n; i++)
    {
        fact *= i;
    }
    return fact;
}

int main()
{
    int temp, sum = 0, num, digits;

    printf("Enter a number :\n");
    scanf("%d", &num);

    temp = num;
    while (temp > 0)
    {
        digits = temp % 10;
        sum += factorial(digits);
        temp /= 10;
    }

    if (sum == num)
    {
        printf("%d is a strong number", num);
    }
    else
    {
        printf("%d is not a strong number", num);
    }
}