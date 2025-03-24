package functions_in_java.functions;

public class Functioninjava1 {
	//access modifier
	//public (used anywhere)
	public void publicFunction() {
		System.out.println("THis is a publicFunction");
	}
	/*2.private function
	 * within class*/
	private void privateFunction() {
		System.out.println("THis is a privateFunction");}
	/* 3.default function
	 * within package*/
	 void defaultFunction() {
		System.out.println("THis is a defaultFunction");}
	 
	 /* 4.protected function
	  * within package and subclass in different package*/
	 protected void protectedFunction() {
			System.out.println("THis is a protectedFunction");}
	 
	 /*5.static function
	  * we can access by using class name*/
	 public static void staticFunction() {
		 System.out.println("this is a static function");
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functioninjava1 obj=new Functioninjava1();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
		obj.staticFunction();
		

	}

}
