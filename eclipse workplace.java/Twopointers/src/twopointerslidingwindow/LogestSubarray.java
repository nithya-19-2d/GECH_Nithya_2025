package twopointerslidingwindow;

public class LogestSubarray {
	public static void main(String[] args) {
		int arr[] = {2 , 3 , 4 , 5 , 6};
		int k=14;
		int n = arr.length;
		
		for(int i=0; i< n; i++) {
			for(int j=i; j<n ; j++) {
				for(k=i ; k<=j; k++) {
					System.out.print(arr[k] + "");
				}
				System.out.println();
			}
		}
	}

}
