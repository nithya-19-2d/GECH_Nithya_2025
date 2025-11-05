package typecastinginjava;

class One{
	public void A() {
		System.out.println("A");
	}
}

class Two extends One{
	public void A() {
		System.out.println("B");
	}
}


public class Upcasting {
public static void main(String[] args) {
	One o = new Two();
	o.A();
}
}
