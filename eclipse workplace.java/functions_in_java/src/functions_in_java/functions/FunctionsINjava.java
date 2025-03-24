package functions_in_java.functions;

public class FunctionsINjava {
	//1
	public int add(int a, int b) {
		return a+b;
		
	}
	//2
	public int add1(int a, int b) {
		return a+b;}
	public void add2(int a, int b) {
		System.out.println(a+b);
	}
	//3
	public void add3(int a, int b) {
		System.out.println(a+b);
	}
	//4
	public void add4() {
		System.out.println("not accepting any values");
	}
	
	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Functions/method in java:
		 * ======================
		 * <access modifier> return_type function_name(parameter){
		 * code
		 * }
		 * 
		 * two
		 * */
		FunctionsINjava obj1 = new FunctionsINjava();
		int res = obj1.add(19,20);
		System.out.println("output is:" +res);
		obj1.add2(23, 23);
		obj1.add3(34, 34);
	}

}
