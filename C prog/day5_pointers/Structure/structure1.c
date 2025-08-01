// '.' => is used for accessing , and it is a accessing operator.

// UNIOI
/*------------
It is similar to structure but we can access only one instance(ex : regnum or name) at time so that the to introduced the structure

Syntax
=========
struct Structure_name{
data_type variable1;
data type variable2;
data_type variable3
};

*/

#include <stdio.h>

int main()
{
    struct Structure
    {
        int id;

        char name[20];
        char branch[20];
        int sem;
    };

    // to create object for the class structer_name then use obj_name.field_name , to access the value
    // struct structure_name var1 = { add the value to the fields }

    struct Structure s1 = {1, "Nithya", "cse", 5};

    struct Structure s2 = {1, "shwetha", "cse", 5};

    printf("the information of student1 is :%s \n", s1.name);
    printf("the information of student1 is :%d \n", s1.id);
    printf("the information of student1 is : %s\n", s1.branch);
    printf("the information of student1 is : %d\n", s1.sem, "\n");

    //====================
    printf("the information of student1 is :%s \n", s2.name);

    
    printf("the information of student1 is :%d \n", s2.id);
    printf("the information of student1 is : %s\n", s2.branch);
    printf("the information of student1 is : %d\n", s2.sem);
}
