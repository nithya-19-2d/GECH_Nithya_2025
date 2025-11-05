package Constructorinjava;

class Car{
	
	public String name;
	int number;
	float discount;
	
	public Car() {
		super();
	}
	
//parameteried constructor
	public Car(String name, int number, float discount) {
		super();
		this.name = name;
		this.number = number;
		this.discount = discount;
	}

	//tostring
	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + ", discount=" + discount + "]";
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
		System.out.println("the name is :" +car1.name);  //null for String
		System.out.println("the number is :" +car1.number); //0 for int
		System.out.println("the discount is :" +car1.discount); //0.0 for float and for char - ' '
		
		Car car2 = new Car("niuu", 32 , 45);
		System.out.println(car2); //toString added  //  which print like this if we just pass the obj directly ->(Constructorinjava.Car@3f91beef) , to display the values of each variable we need use toString for the above class , then we pass the object ok.
		
		
	}

}


