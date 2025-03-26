package final_this_superkeywords;

class Person{
	//1.
	public String name;
	public int age;
	
	//no args
	//2.
	public Person() {
		System.out.println("default constructor");
	}
	
	//all-arguments constructor
        public Person(String name, int age) {
//		super();
        this(); //which calls(accsess no args person) the no args Person
		this.name = name;
		this.age = age;
	}
        //3.
        public void sayhii() {
        	System.out.println("hello");
        }
        
        public void display() {
        	this.sayhii();
        	System.out.println("Name is:"+this.name);
        	System.out.println("Age is:"+this.age);
        }
	
	
	
	
}

public class ThisInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This Keyword
		 * ========
		 * 1.used to refer instance variable current class
		 * 2.used to refer the current class constructor
		 * 3.used to refer method in current class*/
		
		
		Person person = new Person("nithya",21);
		person.display();

	}

}
