package interfaceinjava21;

interface A{
	public void method();
}
interface B{
	public void method();
		
	
}
//interface c{
//	public void methodc();
//}
//
//interface d{
//	public void methodc();
//}
class method implements A,B{

//	@Override
//	public void methodB() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodA");
//		
//	}
//
//	@Override
//	public void methodA() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodB");
//		
//	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("This method from both A abd b interface");
		
	}

//	@Override
//	public void methodc() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodc");
//		
//	}
	
}


public class Inhertenceinjava1 {

	/*
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method Method=new method();
//		Method.methodA();
//		Method.methodB();
		Method.method();
		
		

	}

}
