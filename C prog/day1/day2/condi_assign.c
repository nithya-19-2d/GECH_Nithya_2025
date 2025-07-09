#include <stdio.h>
int main()
{

    int age;
    printf("enter a age \n");
    scanf("%d", &age);
    if (age >= 0 && age <= 12)
    {
        printf("Is a child");
    }
    else if (age >= 13 && age <= 19)
    {
        printf("Is a Teeneger");
    }
    else if (age >= 20 && age <= 59)
    {
        printf("Is a adult");
    }
    else if (age < 0)
    {
        printf("invalid");
    }
    else
    {
        printf("there is no that age");
    }
    return 0;
}