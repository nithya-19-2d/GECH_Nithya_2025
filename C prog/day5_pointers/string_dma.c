#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char *fname;
    char *lname;
    int fname_size, lname_size;
    printf("Enter the sixe / length of the fname \n");
    scanf("%d", &fname_size);
    printf("Enter the sixe / length of the lname \n");
    scanf("%d", &lname_size);
    fname = (char *)malloc(fname_size * sizeof(char));
    lname = (char *)malloc(lname_size * sizeof(char));
    printf("the pointer is %x \n", fname);
    printf("the pointer is %x", lname);
}