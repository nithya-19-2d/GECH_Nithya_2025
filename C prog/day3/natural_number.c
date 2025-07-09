#include <stdio.h>

/*
While loop
==========
Syntax
while(condition){
//code
increment/decrement
}

*/
// calculate sum of natural number
int main()
{
    int num, sum = 0, i = 0;

    printf("Enter a number :\n");
    scanf("%d", &num);
    while (i <= num)
    {
        sum = sum + i;  //sum+=i;
        i++;
    }

    printf("sum of %d number is : %d", num, sum);
    return 0;
}