#include <iostream>

int main()
{
    std::string name;
    int age;
    char gender;

    std::cout << "Enter name: ";
    std::cin >> name;
    std::cout << "Enter age ";
    std::cin >> age;
    std::cout << "Enter gender ";
    std::cin >> gender;

    std::cout << " name is " << name << " and age " << age << " and gender is " << gender << " gender ";
}