#include <iostream> // to include the cin and cout
using namespace std;

// Base class
class Parent
{
public:
    string parent_name;

    void showParentDetails()
    {
        cout << " The name of the parent is " << parent_name << endl;
    }
};

// derived class
// visibility mode = public , private or protect
// syntax
// class child_name = visibility mode parent_name{ };
class Child : public Parent
{

public:
    string child_name;

    void shoechilddetails()
    {
        cout << " The child name is " << child_name << endl;
    }
};

int main()
{

    Parent p1;
    Child c1;
    c1.child_name = "Nithya";
    c1.parent_name = "Anil";
    c1.shoechilddetails();
    c1.showParentDetails();
    p1.parent_name = "lakshmi";
    p1.showParentDetails();
}
