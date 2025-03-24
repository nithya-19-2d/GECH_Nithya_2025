package oopsinjava.inheritence;

 interface interface2{
	public default void interfacemethods() {
		System.out.println("hii , hello");
	}
 }
	
 
 interface interface4{
		public void interfaceMethod();
		}
 
 class parentnoone {
	 public void studentmethod() {
		 System.out.println("this is a student method");
	 }
 }
 
 class Teacher extends parentnoone implements interface4, interface2 {

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("hii , iam interfac24");
		
	} 
	 
 }
 
 
 
public class Multiple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher bag=new Teacher();
		bag.studentmethod();
		bag.interfaceMethod();
		bag.interfacemethods();

	}
}
 

