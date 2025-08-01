package abstractioninjava;


//is a concrete class  => means class contain full implementation.
//class Person{
	
	//public void iswhat()  // is a non abstract method or concrete method
	//{ 
		//System.out.println("the parson is a man");
	//}
//}

//anstract class or non-concrete class
//abstaction is a abstract method which contain one abstract method., using this we can achieve partial abstraction.
abstract class Person{
	public abstract void iswalking();  // if we create abstract method using abstract keyword in the method , its shows the make the class_name(class) as abstact
    //we cannot create an instance(object) to the abstract class , because the abstract method , doesnot contain the implementaion  , to crate an object, the class must contain the implementaion for an method of an class 
	//but we craete an object for an abstrct class , by instantiating the method in where we creating the object(means overriding the method)
	
	public void issleeping() {
		System.out.println("person is sleeping");
	}
}

class Student extends Person{

	@Override
	public void iswalking() {
		System.out.println("the person is walking");
	}
	
	
	//we can override the parent class method
	@Override
	public void issleeping() {
		System.out.println("the person , now is wake up");
	}
	
	
}


public class Abstractioninjava {
	
	/*
	 * Abstraction
	 * ===========
	 * it is the process of hiding the implementaion and showing only the essential resource to user
	 * */
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.iswalking();
		std1.issleeping();
		//Person p1 = new Person() 
		/*{
			
//			@Override
//			public void iswalking() {
//				// TODO Auto-generated method stub
//				
//			}   // by creating this(by adding anynomous to the person) , we can invoke the onject. but instead of this we can going to extend abstract method by crating another  child class
			
		};*/
		
		
		
	}

}
