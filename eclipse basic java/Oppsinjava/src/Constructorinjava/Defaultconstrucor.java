package Constructorinjava;

class Car{
	
	public String name;
	int number;
	float discount;
	
	public Car() {
		super();
	}
	
	
	
}

public class Defaultconstrucor {
	
	/*
	 * when we create an default constructor for an object, which will assifn the default value to theinstance variable , for String , it will assign the 'Null' value, and int => 0 and for float it will assign the '0.0' value
	 * constructor belongs to object , not for class  
	 * and when create an object , the jvm , will automatically generate the default constructor , so that constructor belongs to the object 
	 * and when we create the constructor using static , we can not  access instance variable , or constructor 
	 * and we cannot use final keyword in the constructor
	 * this keyword is used to access the static variables and static method.    */
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("the name is :" +car1.name);
		System.out.println("the number is :" +car1.number);
		System.out.println("the discount is :" +car1.discount);
		
		
	}

}


