package Assignment;

class BankAccount{
	private String accountnumber;
	private String accountHolderName;
	private double balance;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		
		if(balance ==0 || balance>=0) {
			balance = balance + amount;
			System.out.println("the deposited amount is:" +amount);
			System.out.println("The Total balance is :" +getBalance());
			
		}
		
	}
	
	public void withdraw(double amount) {
		
		if(balance<amount) {
			System.out.println("you don't have that much balance to withdraw");
		
		}
		else {
			balance = balance-amount;
			System.out.println("the withdrawn amount is :" +amount);
			System.out.println("The remaining balance is :" +getBalance());
		}
		
	}
	
	
	
	
}

public class BankingAccount {
	
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.setAccountHolderName("Nithya");
		b1.setAccountnumber("ABC123");
		System.out.println("The AccountHoldername is :" +b1.getAccountHolderName() + ", Acc_no :" +b1.getAccountnumber() );
		b1.setBalance(500);
		b1.deposit(2000);
		b1.withdraw(2500); 
		
		
		
	} 
	

}
