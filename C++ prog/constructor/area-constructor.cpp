#include <iostream> // to include the cin and cout
using namespace std;

class Area
{

    int lenght, breadth, height; // even if we not give private, it will consider as a private

public:
    int area;

    // if we use parameter consutructor, we must and should use no-arg constructor , for avoiding the error caused by parameter constructor.
    Area()
    {
        lenght = 0;
        breadth = 0;
        height = 0;
        area = 0;
        cout << " The Area Calculation " << endl;
    }

    Area(int side)
    {
        lenght = side;
        breadth = height = 0;
        area = lenght;
        cout << " The area is " << area << endl;
    }

    Area(int len, int bred)
    {
        lenght = len;
        breadth = bred;
        area = lenght * breadth;
        cout << " Area of squre is " << area << endl;
    }

    Area(int l, int b, int h)
    {
        lenght = l;
        breadth = b;
        height = h;
        area = lenght * breadth * height;
        cout << " Area of cube " << area << endl;
    }
};

int main()
{
    int Lenght, Breadth, Height;
    Area A1, A2, A3;
    cout << "Enter the side of area " << endl;
    cin >> Lenght >> Breadth >> Height;

    A1 = Area(Lenght, Breadth, Height);
    A2 = Area(Lenght);
    A3 = Area(Lenght, Breadth);
}