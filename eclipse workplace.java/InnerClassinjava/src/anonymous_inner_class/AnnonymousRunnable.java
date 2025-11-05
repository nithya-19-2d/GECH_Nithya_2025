package anonymous_inner_class;

public class AnnonymousRunnable {
	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Child thread");
				}
				
			}
			
			
		};
		Thread th = new Thread(r);
		th.start();
		for(int i=0; i<10; i++) {
			System.out.println("main thread");
		}
		
	}

}
