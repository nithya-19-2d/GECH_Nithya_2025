package Assignment;

interface Paymentinterface{
	
    void Pay(double amount);
}

class CardPayment implements Paymentinterface{

	@Override
	public void Pay(double amount) {
		
		System.out.println("The amount is payed through the card is: " +amount);
		
	}
	
}

class UPIPayment implements Paymentinterface{

	@Override
	public void Pay(double amount) {
	
		System.out.println("The amount is payied through the upi is: " +amount);
		
	}
	
}

public class Paymentininterface {
	public static void main(String[] args) {
		CardPayment c1 = new CardPayment();
		c1.Pay(5000);
		UPIPayment p1 = new UPIPayment();
		p1.Pay(500);
		
	}
	

}
