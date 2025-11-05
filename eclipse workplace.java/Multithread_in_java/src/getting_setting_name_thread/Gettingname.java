package getting_setting_name_thread;

class NameofThread implements Runnable{

	@Override
	public void run() {
		System.out.println(10/0); // Exception occure in thread-0, -1 ,-2 , like this Exception in thread "Thread-2";
		System.out.println("child thread:" +Thread.currentThread().getName());
	}
	
}

public class Gettingname {

	public static void main(String[] args) {
		NameofThread nameofthread = new NameofThread(); 
		Thread th = new Thread(nameofthread); //for thread we can set the name of thread before start().
		th.setName("Child thread");
		th.start();  // default name = Thread-0
		
		Thread th1 = new Thread(nameofthread);
		th1.start();
		
		Thread th2 = new Thread(nameofthread);
		th2.start();
		
		System.out.println("This main method run by: " +Thread.currentThread().getName()); //  The thread name is = main()
		Thread.currentThread().setName("hello main");   // after setting the thread name it will shows the "hello main" thread
		System.out.println(10/0); //shows ArithmeticException , Exception occure in main thread , like this Exception in thread "main"  . but we can change the thread name. using setname()
		
	}
	
}
