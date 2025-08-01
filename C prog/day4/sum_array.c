#include <stdio.h>

int main()
{
    int i, sum = 0, n;
    printf("Enter the size of an array \n");
    scanf("%d", &n);
    int arr[n];
    printf(" Enter the %d element \n", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Arrsy elemnts are \n");
    for (i = 0; i < n; i++)
    {
        printf("the elemnts index %d\t:%d\n", i, arr[i]);
    }

    printf("the sum of array elements \n");
    for (i = 0; i < n; i++)
    {

        sum += arr[i];
        // printf("the sum of array is %d \n", sum); it prints sum for each loop
    }

    printf("the sum of array is %d \n", sum);

    return 0;
}