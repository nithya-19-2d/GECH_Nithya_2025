package thread_execution_method;

class Mythread4 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " strated execution");
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread:" +i);
			
		}
		System.out.println(Thread.currentThread().getName()+ " Completed Execution");
		
	}
	
}

public class Sleepmethod {
	public static void main(String[] args) {
		
		Thread th = new Thread(new Mythread4());
		th.start();
		try {
			th.sleep(5000);
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
