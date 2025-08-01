package concrete_pojo;

class Student{
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//plain old java object
	/*
	 * it does not contain inheritence, and interface
	 * all fiels should private
	 * it containes getter and setters, constructor(no-args) , tostrings */
	
	
	
}


public class pojoclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				/*
				 * POJA Class
				 * ======
				 * plain old java object(POJO)
				 * 
				 * Rules:
				 * ======
				 * 1.the class is should not extended or implements any class or interface
				 * 2.Every fields(state/properties) should be private
				 * 3.All-args constructor
				 * 4.no-args constructor
				 * toString()
				 * Getter and setters public method
				 * */
				
				Student std=new Student("nithya");
				System.out.println(std);
				std.setName("nithya");
				System.out.println(std.getName());

			}

		


	}


