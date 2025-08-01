#include <stdio.h>

int main()
{
    int a, b, choice;
    printf("1. Add \n");
    printf("2. Subtract \n");
    printf("3. Multiply \n");
    printf("4. Divide \n");

    printf("Enter your choice: ");
    scanf("%d", &choice);
    printf("Enter two numbers: \n");
    scanf("%d %d", &a, &b);

    switch (choice)
    {
    case 1:
        printf("Sum = %d\n", a + b);
        break;
    case 2:
        printf("Difference = %d\n", a - b);
        break;
    case 3:
        printf("Product = %d\n", a * b);
        break;
    case 4:
        if (b != 0)
            printf("Quotient = %d\n", a / b);
        else
            printf("Cannot divide by zero\n");
        break;
    default:
        printf("Invalid choice\n");
    }

    return 0;
}
