package practiceforinterview;

public class Arraytwo {
	
	public static void main(String[] args) {
		
		System.out.println(10/4);
		
		int [][] arr = {{1,2,3,4},
				        {4,5,6,7},
				        {8,9,10,11},
				        {12,13,14,15}};
		
		
		int temp = 0;
		
		
		for(int i=0 ; i<arr.length; i++ ) {
			
			for(int j =i ; j==i; j++) {
				System.out.println("the array value:"+arr[i][j]);
			 temp+=arr[i][j];
			 //System.out.print(temp);
			}
			 	 	
		}
		System.out.println(temp);
		
		
		
	}

}
