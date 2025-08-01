#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    // %s => String
    //  char section;  // single character
    char name[20], copy[20], some[20] = "nithya"; // character array : String
                                                  // printf("Enter your section \n");
                                                  // scanf("%c", &section);
    // printf("your currently present in %c section \n", section);

    printf("Enter name and click enter \n");

    // gets(name);   // it will what we give , irrespective of size

    // sythax for fgets
    // fgets(char_array, sizeof(char_array), stdin)  => take char_array name, the check the size of array and then take the name what we give
    fgets(name, sizeof(name), stdin); // it will take name with the size what we give
    printf("your name is %s \n", name);
    printf("THe given String containes %d character \n", strlen(name));
    // string_copy =>strcpy(copy, name); strcpy(new_value, old_value) => copy the old_string to the new_string.
    printf("the copy array containes :%s", strcpy(copy, name));
    printf("both array containes same data :%d\n", strcmp(copy, some));
}
