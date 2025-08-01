#include <stdio.h>

int main()
{
    int arr[10], size, i = 0;
    printf("Enter array size : ");
    scanf("%d", &size);
    printf("Enter a array element \n");

    for (i; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("the original array element are :");
    for (int i = 0; i < size; i++)
    {
        printf("Index %d : %d \n", i, arr[i]);
    }

    printf("the reverse of array element \n");
    for (i = size - 1; i >= 0; i--)
    {
        printf(" %d ", arr[i]);
    }

    return 0;
}