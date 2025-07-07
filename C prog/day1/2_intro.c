#include <stdio.h>
int main()
{
    int var = 10;
    printf("The result is:%d \n", var); //(single line commenting) specifies the formaye specifier within double cot then put the comma after "" , then specifies the variable name to assign the value of that to %d.

    int a;
    printf("enter a number : \n");
    scanf("%d", &a);
    printf("The value of a is :%d \n", a);

    float b;
    printf("enter the value \n");
    scanf("%f", &b);
    printf("the value is : %f", b);
    return 0;

    // " "=> string; , '' => character; In python => " ", and '' , both are String , there is no character in python
    /**
     * In python => to take the input , we use input method,
     * In c use scanf
     * in java => Scanner
     *
     * \n= new line
     * \b= back space
     * \t = tab space
     */
}