package synchronizationinjava;

class Display{
	public synchronized void wish(String name) { // do for synchronization
		for(int i=0; i<5; i++) {
			System.out.println("Good morning :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name);
		}
	}
	
}

class Mythread extends Thread{
	Display d;
	String name;
	public Mythread(Display d, String name) { //  here the Display d is like a objective type and object name
		
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}

public class Synchronizarion {
	public static void main(String[] args) {
		Display d = new Display();
		Mythread m1 = new Mythread(d , "Nithya");
		Mythread m2 = new Mythread(d , "shwetha");
		m1.start();
		m2.start();
	}

}
