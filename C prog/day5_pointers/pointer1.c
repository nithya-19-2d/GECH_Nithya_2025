// formate specifier for pointer is %p or can use %x
//* => deferencing operator
#include <stdio.h>
int main()
{
    // declaring and intializing value
    // ptr = store address and * = store value
    int num = 5;
    int *ptr = &num;
    printf("The value of num is :%d \n", num);
    printf("The address of num : %x \n", &num);
    printf("The pointer containes : %x \n", ptr);
    printf("The address of pointer : %x \n", &ptr);
    printf("The value of pointer containes : %x \n", *ptr);
}