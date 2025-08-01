#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char *fname;
    char *lname;
    int fname_length, lname_length;
    printf("Enter the fnmae  size  : ");

    scanf("%d", &fname_length);
    printf("Enter the lnmae  size  : ");
    scanf("%d", &lname_length);

    fname = (char *)malloc(fname_length * sizeof(char));
    lname = (char *)malloc(lname_length * sizeof(char));

    if (fname == NULL || lname == NULL)
    {
        printf("the dma is not occure ");
    }

    printf("Enter the fnmae :");
    scanf("%s", fname);
    printf("Enter the fnmae :");
    scanf("%s", lname);

    printf("The full name is: %s \n", strcat(fname, lname));

    free(fname);
    free(lname);
}
