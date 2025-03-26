package final_this_superkeywords;

final class Animal{
	public void animalmethod() {
		System.out.println("dog");
	}
}

//class cant be extend to a final class //shows error
class Dog extends Animal{
	
}


public class FinalInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * final -> we cannot change the value 
		 * variables,method,class
		 * variable --> the variable value cannot be changed
		 * method--> we cannot override
		 * final class --> we cannot extend that class
		 * we create a instance(obj) to the final class but we cann't extend to the parent class
		 * we cann't override the final method
		 * */
		
		final double pi = 23.33;
		System.out.println(pi);
//		pi = 4.55; //pi cannot be assigned

	}

}
