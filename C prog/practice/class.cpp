#include <iostream>
using namespace std;

class Student
{
public:
    char sec;
    string name;
    int age;
    string branch;

    void todisplay()
    {
        cout << "the name is " << name << "the age is " << age << "the branch is " << branch << "section is " << sec << endl;
    }
};

int main()
{
    Student st1, st2, st3;

    st1.name = "Nithya";
    st1.age = 21;
    st1.sec = 'c';
    st1.branch = "cse";
    st1.todisplay();

    cout << "ENter name of the student ";
    cin >> st2.name;
    cout << "Enter the age of the student ";
    cin >> st2.age;
    cout << "Enter the branch ";
    cin >> st2.branch;
    cout << " Enter the ces";
    cin >> st2.sec;
    st2.todisplay();
}