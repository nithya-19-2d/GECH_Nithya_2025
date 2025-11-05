package anonymous_inner_class;

public class AnnynomousStaticinner {
	
	static class Inner{
		public void main() {
			System.out.println("hii");
		}
	}
	

	public static void main(String[] args) {
		Inner i = new Inner();
		i.main();
		
		//or we can create like this also for static inner class.
		
		AnnynomousStaticinner.Inner n = new AnnynomousStaticinner.Inner();
		n.main();
	}
}
