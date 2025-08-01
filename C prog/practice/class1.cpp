#include <iostream>
using namespace std;

class Adhar
{

private:
    string houseName;
    float age;
    int pincode;

public:
    string name, fathername, mothername;

    // setters
    void setdetailes(string hou_name, float a_g, int pin_code)
    {
        houseName = hou_name;
        age = a_g;
        pincode = pin_code;
    }

    void shoedetailes()
    {
        cout << "the name of user is " << name << " and other detailes are " << fathername << " ," << mothername << ", " << houseName << "  " << age << "" << pincode << endl;
    }
};

int main()
{
    Adhar a1, a2;
    string houseNm;
    float age_is;
    int pinco_door;

    cout << "Enter name, age, housename, pincode, fathername, mothername :" << endl;
    cin >> a1.name >> a1.fathername >> a1.mothername >> houseNm >> age_is >> pinco_door;
    a1.setdetailes(houseNm, age_is, pinco_door);
    a1.shoedetailes();

    a2.name = "nithya";
    a2.mothername = "anil";
    a2.fathername = "mahalak";
    a2.setdetailes("nilaya", 21, 753421);
    a2.shoedetailes();
}