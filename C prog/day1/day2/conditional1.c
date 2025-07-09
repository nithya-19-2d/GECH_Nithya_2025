#include <stdio.h>

int main()
{
    int a;
    printf("enter a number \n");
    scanf("%d", &a);
    if (a % 2 == 0)
    {
        printf("This number %d is even", a);
    }
    else
    {
        printf("the number %d is odd", a);
    }

    return 0;
}

/**
 * 10%2 , which checks the remainder;
 * 10/2 , which checks the quotient
 * 
 * if Condtion
 * ==========
 * if(condition){
 * true=>print;
 * }
 * else{
 * if condtion false =>print;
 *  }
 * 
 * else if => is for checking the multiple conditons
 *  int a=10;
 * if(condition){
 * ;}
 * else if(condition){
 * ;}
 * else{
 * ;}
 */