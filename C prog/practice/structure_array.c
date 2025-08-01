#include <stdio.h>

struct Tickate
{
    int booking_id;
    char person_name[20];
    char seat_num[3];
    char movie[50];
};

int main()
{
    struct Tickate Ti[500];
    int numof_person;
    printf("enter the number of person booked : ");
    scanf("%d", &numof_person);

    for (int i = 0; i < numof_person; i++)
    {
        Ti[i].booking_id = i + 1;
        printf("the booking detailes of the %d person is: ", i + 1);
        printf("Enter the deatiles of user \n");
        printf(" Enter the name of the person is : ");
        scanf("%s", &Ti[i].person_name);
        printf(" Enter the seat number of the person is : ");
        scanf("%s", &Ti[i].seat_num);
        printf(" Enter the movie name : ");
        scanf("%s", &Ti[i].movie);
    }

    for (int i = 0; i < numof_person; i++)
    {
        printf("the detailes of person is : ");
        printf("booking id is : %d \n", Ti[i].booking_id);
        printf("person name  is : %s \n", Ti[i].person_name);
        printf("seat number  is : %s \n", Ti[i].seat_num);
        printf("movie name  is : %s \n", Ti[i].movie);
    }
}