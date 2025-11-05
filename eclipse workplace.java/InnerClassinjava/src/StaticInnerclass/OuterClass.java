package StaticInnerclass;


public class OuterClass {
	static class Inner{
		public void main() {
			System.out.println("hii");
		}
	}
	

	public static void main(String[] args) {
		Inner i = new Inner();
		i.main();
		
		//or we can create like this also for static inner class.
		
		OuterClass.Inner n = new OuterClass.Inner();
		n.main();
	}

}
