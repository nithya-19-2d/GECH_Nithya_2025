#include <stdio.h>
#include <string.h>

int main()
{

    float f = 20.00;
    float *ptr = &f;

    int *ptr1;
    int *ptr2 = NULL;
    void *ptr3 = NULL;

    printf("The value of pointer is : %f \n", f);
    printf("The value of float pointer is : %f \n", *ptr);
    printf("The address of pointer is : %p \n", ptr);
    printf("The value of pointer is : %p \n", *ptr1);
    printf("The value null of pointer is : %p \n", ptr2);
    printf("The value of pointer is : %p \n", ptr3);

    ptr3 = &f;

    printf("the void pointer is typecasting into float : %f", *((float *)ptr3));
}