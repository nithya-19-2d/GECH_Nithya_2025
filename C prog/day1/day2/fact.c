#include <stdio.h>
int main()
{
    int fact;
    int a = 1;
    printf("enter a number \n");
    scanf("%d", &fact);
    for (int i = 1; i <= fact; i++)
    {
        a *= i;
    }
    printf("the factorial value is %d \n: ", a);
    return 0;
}