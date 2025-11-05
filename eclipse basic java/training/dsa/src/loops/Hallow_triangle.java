package loops;

public class Hallow_triangle {
	public static void hallowTriangle(int n) {
		//first outer loop
		//traveling rows
		for(int i = 1;i<=n;i++) {
			//first inner loop
			// for space
			for(int j =i;j< n;j++) {
				System.out.print(" ");
			}
			//second inner loop
			//checking condition
			for(int k = 1;k<= (2*i - 1);k++) {
				if(k == 1 || i == n || k == (2*i - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}   
			System.out.println(" ");
			
		}
	}
	
	public static void main(String[] args) {
		hallowTriangle(6);
	}
}
