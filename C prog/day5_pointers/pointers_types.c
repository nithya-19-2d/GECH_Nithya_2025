#include <stdio.h>

int main()
{
    float f = 20.03;
    int n = 23;
    float *fptr = &f;  // Normal pointer referncing some value.
    int *ptr;          // Wild pointer
    int *ptr1 = NULL;  // Null pointer
    void *ptr2 = NULL; // void pointer  => we can give datatypes later by typecasting

    printf("THe Address of ponter containes: %p\n", fptr);
    printf("THe Address of ponter containes: %p\n", ptr);
    printf("THe Address of ponter containes: %p\n", ptr1);
    printf("THe Address of ponter containes: %p\n", ptr2);

    ptr2 = &f; // work as float pointer;
    printf(" the pointer refering the float value : %p \n", *(float *)ptr2);
    ptr2 = &n;

    printf(" the pointer refering the integer value : %p \n", *(int *)ptr2);
}