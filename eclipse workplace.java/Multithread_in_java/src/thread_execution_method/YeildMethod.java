package thread_execution_method;

class Mythread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10 ; i++) {
			System.out.println("Child Thread");
			Thread.yield(); //this will the chance to execute to the waiting thread (here main thread)
		//if there is  waiting thread with all threads prority is same then , the thread execution is depends on thread scheduler
		//atleast one or more time main thread will run first , then concurrently child and main thread will run.
		}
		
		
	}
	
}

public class YeildMethod {
	public static void main(String[] args) {
		Mythread m1 = new Mythread();
		Thread ths = new Thread(m1);
		ths.start();
		for(int i=0; i<10 ; i++) {
			System.out.println("Main Thread "); 
			
		}
		// for normal thread also ,output is unpridictable , the output will excecuted in cuncurrently
		//* o/p here thread always yeild() now main will more chance than child thread.

	}
	
	
	

}
