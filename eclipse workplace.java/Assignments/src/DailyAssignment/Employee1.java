package DailyAssignment;

class Employeework{
	private int accountnumber;
	private String accountname;
	private double Balance;
	
    
	
	public Employeework(int accountnumber, String accountname, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.accountname = accountname;
		Balance = balance;
	}



	public void display() {
		System.out.println("the account number is:"+accountnumber);
		System.out.println("the accountname is:"+accountname);
		if(Balance==0) {
			System.out.println("deposit:"+((this.Balance+500)));
		}
		else if(Balance==Balance) {
			System.out.println("withdraw:"+((this.Balance-100)));
		}
		else {
			System.out.println("there is no account");
		}
	}
	
	
}

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeework employee=new Employeework(12345,"nithya",2500.0);
		employee.display();

	}

}
