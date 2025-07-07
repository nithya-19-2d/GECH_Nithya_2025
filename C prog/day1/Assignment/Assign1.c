#include <stdio.h>
int main()
{
    char b;
    printf("Enter a character \n ");
    scanf("%c", &b);
    printf("the character is %c", b);

    double c;
    printf("Enter a number \n");
    scanf("%lf", &c);
    printf("the number is : %lf", c);

    return 0;
}