#include <iostream>

using namespace std;

class Add
{

private:
    int a, b, c;

public:
    int result;

    // default constructor
    Add()
    {
        a = 0;
        b = 0;
        c = 0;
        result = 0;
    }

    // parameterized constructor
    Add(int n1, int n2, int n3)
    {

        a = n1;
        b = n2;
        c = n3;
        result = a + b + c;

        cout << "sum is "
             << result << endl;
    }

    Add(int n1, int n2)
    {

        a = n1;
        b = n2;
        c = 0;
        result = a + b + c;

        cout << " sum is \n"
             << result << endl;
    }

    // getters
    void disply()
    {

        cout << "the parameters are " << a << " and "
             << b << " and "
             << c << " the result is "
             << result << endl;
    }
};

// its a constructor overloading and (also a polymorphism example)

int main()
{
    Add A1, A2, A3, A4;
    int a, b, c;
    cout << "Enter a number \n";
    cin >> a >> b >> c;

    A1 = Add(a, b, c);
    A1.disply();

    A2 = Add(2, 3, 6);
    A2.disply();

    A3 = Add(2, 5);
    A3.disply();

    A4 = Add();
    A4.disply();
}
