package com.interupt;

class Mythread extends Thread{
	public void run() {
		System.out.println("child thread");
		
			try {
				for(int i=0; i<=5; i++) {
					System.out.println("thread running..... iteration " +i);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				
				System.out.println("Thread was interrupted! Cleaning up....");
			}
			System.out.println( " Thread ends .");
		}
		
		
	}
	



public class Interrupt {
	public static void main(String[] args) {
		
		Mythread m1 = new Mythread();
		m1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "main strated interrupts child thread");
		m1.interrupt();
		
		
	}

}
