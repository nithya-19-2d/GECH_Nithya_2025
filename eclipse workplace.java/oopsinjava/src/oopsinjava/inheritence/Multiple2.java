package oopsinjava.inheritence;

interface inter{
	public default void methodinter() {
		System.out.println("hi, good morning");
	}
}

interface internal{
	public default void methodinternal() {
		System.out.println("hi, good nieght");
	}
}

interface intermediate extends inter,internal{
	public default void methodinter() {
		System.out.println("hi, good");
	}
}

class parents implements intermediate {
	public void parentsare() {
		System.out.println("parents are good");
	}
}

class childsupport extends parents {
	public void methodofchild() {
	System.out.println("pafents are not good");
}
}

class childsupporttime extends parents {
	public void methodofchildfirst() {
	System.out.println("pafents are not good");
}
}





public class Multiple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 parents pares = new  parents();
		 pares.methodinter();
		 pares.methodinternal();
		 
		 childsupport child = new  childsupport();
		 child.parentsare();
		 child.methodofchild();
		 
		 
		 childsupporttime child1 = new  childsupporttime();
		 child1.parentsare();
		 child1.methodofchildfirst();
		 
		 
		 
		 
		 
		
		

	}

}
