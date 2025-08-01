#include <stdio.h>

int main()
{
    int i = 1, a;

    printf("Enter a number :\n");
    scanf("%d", &a);

    for (i; i <= a; i++)
    {
        printf("the value of a is :%d  \n", i);
    }
}