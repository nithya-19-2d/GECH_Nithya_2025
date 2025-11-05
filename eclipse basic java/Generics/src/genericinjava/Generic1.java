package genericinjava;

class MyGenericclass<T>{
	private T variable;

	public MyGenericclass(T variable) {
		super();
		this.variable = variable;
	}

	public T getVariable() {
		return variable;
	}

	public void setVariable(T variable) {
		this.variable = variable;
	}
	
}

public class Generic1 {
	
	public static void main(String[] args) {
		
		MyGenericclass<String> m1 = new MyGenericclass("Mohan");
		//System.out.println(m1.variable);  if we create variable using private we cannot access like this , we have to use getters 
		System.out.println(m1.getVariable());
		m1.setVariable("Nithya");
		System.out.println(m1.getVariable());
		
	}

}
