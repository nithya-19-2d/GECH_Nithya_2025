#include <stdio.h>
int main()
{
    int arr[10], size, value, temp;
    printf("Enter the number of elements:\n");
    scanf("%d", &size);
    printf("Enter the array elements:\n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &value);
        arr[i] = value;
    }
    printf("\nOriginal Array:\n");
    for (int i = 0; i < size; i++)
    {
        printf("Index %d: %d\t", i, arr[i]);
    }

    // for (int i = 0; i < size; i++)
    // {
    //     for (int j = 0; j < size; j++)
    //     {
    //         if (arr[j] > arr[j + 1])
    //         {
    //             temp = arr[j];
    //             arr[j] = arr[j + 1];
    //             arr[j + 1] = temp;
    //         }
    //     }
    // }

    for (int i = 0; i < size - 1; i++)
    {
        for (int j = 0; j < size - 1; j++)
        {
            if (arr[j] < arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("the sorted array is \n");
    for (int i = 0; i < size; i++)
    {

        printf("the sorted array are %d : \n", arr[i]);
    }
}