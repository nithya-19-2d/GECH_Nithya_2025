package innerclasses;

//1
	public class Innerclass{
	
		class Department{
			
			public int age = 10;
		
		}
		
		
	public static void main(String[] args) {
		System.out.println("hello world");
		Innerclass outer = new Innerclass();
		Department dept = outer.new Department();
		System.out.println(dept.age);
		
	}

	
	}

