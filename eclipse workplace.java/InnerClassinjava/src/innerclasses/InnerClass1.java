package innerclasses;

//2
public class InnerClass1 {
	
	class Engine{
		public String name = "Nithya";
	}
	
	public void m1() {
		Engine e1 = new Engine();
		System.out.println(e1.name);
		
	}
	
	public static void main(String[] args) {
		InnerClass1 ir1 = new InnerClass1();
		ir1.m1();
	}

}
