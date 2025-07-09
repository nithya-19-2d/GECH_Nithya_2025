#include <stdio.h>
int main()
{

    int a = 0;
    for (a; a <= 50; a++)
    {
        if (a % 2 == 0)
        {
            printf("the even number is:%d \n", a);
        }
        else
        {
            printf("invalid");
        }
    }

    // print 9 tables
    printf("enter a number \n");
    scanf("%d", &a);
    for (int i = 0; i <= 10; i++)
    {

        printf("%d*%d :%d \n", a, i, a * i);
    }

    return 0;
}