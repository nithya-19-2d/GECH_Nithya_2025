package interfaceinjava21;

interface Anilmal{
	public void makesound();
	
}

class dog implements Anilmal{

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks");
		
	}
	
}

class cat implements Anilmal{

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("cat make sounds");
		
	}
	
}
public class Interfaceinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
       * Interface
       * =====
       * It is a blue print of the class
       * the method in the interface by default abstract (does not contain body)
       * from java 8 we can write default and static methods in interface
       *  if we don't know the complete implementation of a particular method then we use the,
       *   interface as we can access the method inside the class when we know what we want to implement
       * 
       * interface interface_name{
		 *  	//code
		 *  }
		 *  
		 *  interface Animal{
		 *  	public void makeSound();
		 *  }
       * 
       * */
		dog Dog = new dog();
		Dog.makesound();
		
		cat Cat = new cat();
		Cat.makesound();
	}

}
