#include <iostream> // to include the cin and cout
using namespace std;

class student
{

public:
    string name;

    // setters

    void setname(string sname)
    {

        name = sname;
    }

    // getters

    void display()
    {
        cout << " the name of student is " << name << endl;
    }
};

// default access modifier used is private
class Employee : public student
{

public:
    void showmessage()
    {
        cout << name << " is now working as employee " << endl;
    }
};

int main()
{
    int name;
    student s1;
    Employee e1;
    cout << " entera student name " << endl;
    cin >> e1.name;
    // s1.display();
    e1.display();
    e1.showmessage();
}