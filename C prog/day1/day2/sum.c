#include <stdio.h>

// sum of natural number(start from 1)

int main()
{
    int sum = 0; // to print from 1;
    int a;
    printf("enter a natural number \n");
    scanf("%d", &sum);
    for (int i = 1; i <= sum; i++)
    {
        a = sum + i;
    }

    printf("the sum is: %d \n", a);

    
}
