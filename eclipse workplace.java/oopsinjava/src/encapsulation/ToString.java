package encapsulation;

class Person{
	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
//		return "Person [name=" + this.name + ", age=" + this.age + "]";
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
}

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * toString
		 * ======
		 * it is method that is used to display the objects
		 * to generate tostring , right-click ,then click on source, then click on generate toString()*/
		
		Person person= new Person("nithya",23);
		System.out.println(person);

	}

}
