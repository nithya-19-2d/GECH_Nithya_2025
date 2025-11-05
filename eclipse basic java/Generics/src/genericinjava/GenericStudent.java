package genericinjava;

class Student<R , T>{
	private R name;
	private T roll;
	
	
	public Student(R name, T roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	
	public R getName() {
		return name;
	}
	public void setName(R name) {
		this.name = name;
	}
	public T getRoll() {
		return roll;
	}
	public void setRoll(T roll) {
		this.roll = roll;
	}
	
	
}

public class GenericStudent {
	
	public static void main(String[] args) {
		Student<String, Integer> s1 = new Student("Nithya" , 21);
	    System.out.println(s1.getName() +  " and roll no is " +s1.getRoll());	
		
	}

}
