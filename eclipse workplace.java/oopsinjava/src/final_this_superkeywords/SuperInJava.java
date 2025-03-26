package final_this_superkeywords;

class NewAnimal{
	public String name;
	public int age;
	public NewAnimal(String name, int age) {
		super();
		System.out.println("the parent constructor");
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("name is:"+this.name);
		System.out.println("age is:"+this.age);
	}
	
	
}

class Newdog extends NewAnimal{
	public String eat;

	public Newdog(String name, int age,String eat) {
		super(name, age);
		System.out.println("child class constructor");
		this.eat=eat;
		
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		super.display();
		System.out.println("dog eat:"+eat);
		System.out.println("the dog name is:"+super.name);
		
	}
	
}

public class SuperInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * super
		 * ======
		 * 1.used to call super(parent) calss instance variable 
		 * 2.used to call super(parent) calss  constructor
		 * 3.used to call super(parent) calss method 
		 * */
		Newdog dog = new Newdog("bruno",12,"meat");
		dog.display();
		
		

	}

}
