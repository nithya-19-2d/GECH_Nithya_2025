package oopsinjava.inheritence;

interface Interface2{
	public default void interfacemethod() {
		System.out.println("this is a interface method");
	}
}

class Parentchildclass{
	public void parentmethod() {
		System.out.println("this is a parent");
	}
}

class childclassparent extends Parentchildclass implements Interface2{
      public void childmethod() {
    	  System.out.println("child method");
      }
}

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childclassparent childhood = new childclassparent();
		childhood.parentmethod();
		childhood.interfacemethod();
		

	}

}
