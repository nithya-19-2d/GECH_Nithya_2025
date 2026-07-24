#include <iostream>

using namespace std;
// #include<string.h>

class Student
{

public:
    int age;
    std::string name;

    Student()
    {
    }

public:
    Student(int std_age, string st_nsme)
    {
        age = std_age;
        name = st_nsme;
    }

    Student(const Student &s) // copy constructor , it will be fine during class has dynamic memory
    {
        age = s.age;
        name = s.name;
    }

    void display()
    {
        cout << age << "and" << name << endl;
    }
};

int main()
{

    Student S2;
    Student S1 = Student(21, "nithya");
    S1.display();

    Student S2 = S1;
    S2.display();

    return 0;
}