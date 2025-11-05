package thread_execution_method;

class Mythread2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " strated execution");
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread:" +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " Completed Execution");
		
	}
	
}

public class JoinThread  {
	
	public static void main(String[] args) {
		
		Mythread2 m2 = new Mythread2();
		Thread ths = new Thread(m2);
		ths.start();
		try {
			ths.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(Thread.currentThread().getName()+ "main strated execution");
			for(int i=0; i<5; i++) {
				System.out.println("Main Thread:" +i);
			}
			System.out.println(Thread.currentThread().getName()+ " MainCompleted Execution");
			
		
		
		
	}

}
