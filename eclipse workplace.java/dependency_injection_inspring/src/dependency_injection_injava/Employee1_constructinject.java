package dependency_injection_injava;

public class Employee1_constructinject {
	public String name;
	public Address1 address;

	//constructor injetion
	public Employee1_constructinject(String name, Address1 address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("name " +name);
		System.out.println("city" +address.city);
		System.out.println("state " +address.state);
	}
	
	public static void main(String[] args) {
		Address1 addr = new Address1("bengalure" , "karnataka");
		Employee1_constructinject emp = new Employee1_constructinject("nithya" , addr); // constructor injection
		
		emp.display();
		
	}


}
