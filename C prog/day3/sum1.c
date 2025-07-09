#include <stdio.h>

int main()
{
    int sum = 0, a;
    printf("Enter a number \n");
    scanf("%d", &a);

    for (int i = 0; i <= a; i++)
    {
        printf("%d + %d : %d", sum, i, sum+i);
       
    }

    
}