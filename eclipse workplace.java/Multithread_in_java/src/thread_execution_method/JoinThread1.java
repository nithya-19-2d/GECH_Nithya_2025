package thread_execution_method;

class Mythread3 implements Runnable{

	

	public static Thread mt; //  to make the child thread in wait state we have to create like this

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName()+ " strated execution");  // if i write this , it will executed before main thread
		try {  // which will make the child thread in wait state untill the main thread completly executed , after complete execution , the child start to excecution
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " strated execution");
		
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread:" +i);	
		}
		System.out.println(Thread.currentThread().getName()+ " Completed Execution");
		
	}
	
}

public class JoinThread1 {
	public static void main(String[] args) {
		Mythread3.mt = Thread.currentThread(); //main
		Thread ths = new Thread( new Mythread3());
		ths.start();
		
			System.out.println(Thread.currentThread().getName()+ "main strated execution");
			for(int i=0; i<5; i++) {
				System.out.println("Main Thread:" +i);
			}
			System.out.println(Thread.currentThread().getName()+ " MainCompleted Execution");
			
		
		
	}

}
