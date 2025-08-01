#include <stdio.h>
#include <stdlib.h>
int main()
{
    float *ptr1;
    int num;

    printf("Enter the size of elements to store \n");
    scanf("%d", &num);
    printf("Enter %d float value :\n", num);
    ptr1 = (float *)calloc(num, sizeof(float));

    for (int i = 0; i < num; i++)
    {
        scanf("%f", &ptr1[i]);
    }

    printf("the given float elements are fallows: \n");
    for (int i = 0; i < num; i++)
    {
        printf("%.2f \n", ptr1[i]);
    }
}