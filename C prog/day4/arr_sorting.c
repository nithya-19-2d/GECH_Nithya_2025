#include <stdio.h>

int main()
{
    int n, value, i, j;
    int arr[n];
    printf("Enter a size of array \n");
    scanf("%d", &n);
    printf("Enter a %d element \n", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &value);
        arr[i] = value;
    }

    printf("original value \n");
    for (i = 0; i < n; i++)
    {
        printf("the values are %d \n", arr[i]);
    }

    printf("the sorting values are \n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    for (j = 0; j < n; j++)
    {

        printf("the sorting elements are %d \n", arr[j]);
    }

    return 0;
}