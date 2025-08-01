#include <stdio.h>

int main()
{
    int n, i, isPalindrome = 1;

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

    for (int i = 0; i < n / 2; i++)
    {
        if (arr[i] != arr[n - i - 1])
        {
            isPalindrome = 0;
            break;
        }
    }

    if (isPalindrome)
    {
        printf("The given array is Palindrome");
    }
    else
    {
        printf("The given array is not a Palindrome");
    }
    return 0;
}