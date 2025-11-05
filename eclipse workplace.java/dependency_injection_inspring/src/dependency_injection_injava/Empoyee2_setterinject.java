package dependency_injection_injava;

public class Empoyee2_setterinject {

	private String name;
	private Adress2 address;

	//setter injection
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress2 getAddress() {
		return address;
	}

	public void setAddress(Adress2 address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		Adress2  addr = new Adress2();
		addr.setCity("mysore");
		addr.setState("karnataka");
		Empoyee2_setterinject emp = new Empoyee2_setterinject();
		emp.setName("nithya");
		emp.setAddress(addr); // setter injection
		
		System.out.println("name :" + emp.getName());
		System.out.println("adress: " +emp.getAddress().getCity());
		
	}

}
