#include <stdio.h>

int main()
{
    struct structure2
    {
        int reg_id;
        char name[20];
        char branch[20];
        int sem;
    } it2;

    printf("Enter name of student \n");
    scanf("%s", &it2.name);
    printf("Enter branch of student \n");
    scanf("%s", &it2.branch);
    printf("Enter sem of student \n");
    scanf("%d", &it2.sem);
    printf("Enter id of student \n");
    scanf("%d", &it2.reg_id);

    printf("the student detail is \n");

    printf("%d \n", it2.reg_id);
    printf("%s \n", it2.name);
    printf("%s \n", it2.branch);
    printf("%d \n", it2.sem);
}