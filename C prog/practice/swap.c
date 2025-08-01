#include <stdio.h>

int main()
{
    int a = 10;
    int b = 30, temp;
    temp = a + b; // 40
    a = temp - a;
    b = temp - a;

    printf(" After swapping , the value of  a is %d and b is %d :", a, b);
}
