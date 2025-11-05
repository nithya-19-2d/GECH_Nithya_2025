package com.runnable_interface;

class ThreadClass implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
		
	}
	
	public void start() {
		
	}
	
	
}


public class RunnableInterface {
	
	public static void main(String[] args) {
		ThreadClass class1 = new ThreadClass();
		Thread th = new Thread(class1);
		Thread th1 = new Thread();
		th.start();// create one thread and call the run method present in the Threadclass
		th1.start(); // create new thread and call the start() method present in the super(parent) Thread  , and it will wont print anything
		class1.start(); // which will considered as a normal method, not a thread method
		for(int i=0; i<10 ; i++) {
			System.out.println("main method");
		}
	}

}
