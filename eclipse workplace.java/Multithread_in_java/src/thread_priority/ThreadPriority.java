package thread_priority;

class Mythread implements Runnable{

	@Override
	public void run() {
		System.out.println("Child Thread");
		System.out.println(" Name of Child thread " + Thread.currentThread().getName()); // Thread-0
		System.out.println("Priority of child thread : " +Thread.currentThread().getPriority()); //default = 5
		
	}
	
}

public class ThreadPriority {
	
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		Thread th = new Thread(mythread);
		th.setPriority(9); // the thread scheduler first allocate the processor to the heigest priority thread(Un this child) , then after execute the main method
		th.start(); //which call the runnable state 
		
		/*
		 * Priority is a suggestion to the thread scheduler; 
		 	it’s not guaranteed that a higher priority thread will always execute first. It depends on the OS and JVM implementation.
		 * Without join(), you may see the main thread printing first, even if the child has higher priority.
		 
		 * ✅ What start() does
				thread.start() tells the JVM to create a new thread and call its run() method asynchronously.
				It does not block the main thread; it returns immediately after scheduling the new thread.
				
			✅ What join() does
				thread.join() makes the calling thread (main) wait until the target thread (thread) completes its execution.
				If you call join() before start(), it will do nothing because the thread hasn’t even started.
					
		 */
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // this will make the another thread ,means lowest priority thread(here main thread) to wait, untill the heigest priority thread(here child thread) executed completly
		System.out.println("Name of main method :" +Thread.currentThread().getName()); //name is = main
		System.out.println("priority of main thread :" +Thread.currentThread().getPriority()); //default = 5
	}

}
