package dependency_injection_injava;

public class Employee_fieldinjec {
	public String name;
	public Address address;

	

	

	public static void main(String[] args) {
		Employee_fieldinjec employee = new Employee_fieldinjec();
		System.out.println("Before");
		System.out.println(employee.name);
		System.out.println(employee.address);

		// to get the adress of employee class we need to create the object for Adress
		// also
		Address address = new Address();
		address.name = "bengalure";
		employee.name = "nithya";
		employee.address = address; // field injection
		System.out.println("After");
		System.out.println(employee.name); // nithya
		System.out.println(employee.address); // hash code / address
		System.out.println(employee.address.name); // which will give bengaluru

	}

}
