#include <stdio.h>
int main()
{
    int value, n;
    int arr[n];
    printf("Enter the size of array:\n");
    scanf("%d", &n);
    printf("Enter the %d element \n", n);

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &value);

        arr[i] = value;
    }

    printf("The Elements are \n");
    for (int j = 0; j < n; j++)
    {
        printf("%d \n", arr[j]);
    }
}
