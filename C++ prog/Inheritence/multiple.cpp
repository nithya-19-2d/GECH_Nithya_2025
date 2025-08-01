#include <iostream> // to include the cin and cout
using namespace std;

// student and employee => developers

class Student
{
public:
    string name;

    void showStudent()
    {
        cout << " the name is " << name << endl;
    }
};

class Employee
{
public:
    string compay;

    void shoecompany()
    {
        cout << " he also an employeem of the company " << compay << endl;
    }
};

// syntax for multiple inhiretence
// class child_name : public parent_name public parent_name{};

class Developer : public Student, public Employee
{

public:
    string skills[5];
    void ShowDeveloperskills()
    {
        for (int i = 0; i < 5; i++)
        {

            cout << i + 1 << " ." << skills[i] << endl;
        }
    }
};

int main()
{
    string tech[5], name_of_person, name_company;
    // Student s1;
    // Employee e1;
    Developer d1;
    cout << " Enter name and his company name " << endl;
    cin >> name_of_person >> name_company;
    cout << " Enter the Skills set of the student " << endl;
    for (int i = 0; i < 5; i++)
    {
        cin >> tech[i];
    }
    for (int i = 0; i < 5; i++)
    {
        d1.skills[i] = tech[i];
    }
    // s1.name = name_of_person;
    d1.name = name_of_person;
    d1.compay = name_company;
    d1.showStudent();
    d1.shoecompany();
    d1.ShowDeveloperskills();
}
