package innerclasses;

import innerclasses.University.Deartment;

class University{
	
	class Deartment{
		public String name = "hii";
	}
}

public class Innerclass2 {
	public static void main(String[] args) {
		University u1 = new University();
		Deartment d1 = u1.new Deartment();
		System.out.println(d1.name);
		
		
		
	}

}
