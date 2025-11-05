package StaticInnerclass;

class Outer {
	public static String message = "Hello";
	public String name = "Swathi";

	static class Inner {
		public void display() {
			System.out.println(message);
//			System.out.println(name);
		}
	}

}


public class Staticinnerclass2 {
	
	

	//it contains the static nested inner class inside one outside class
	//we can access only the static members of the outer class.
	//we can create object using the Outer.Inner 
	//we can't be able to access the non-static members of the outer class in the inner class method. 
	
	

		public static void main(String[] args) {
//			Inner in=new Inner();
			Outer.Inner obj = new Outer.Inner();
			obj.display();

		}

	}


