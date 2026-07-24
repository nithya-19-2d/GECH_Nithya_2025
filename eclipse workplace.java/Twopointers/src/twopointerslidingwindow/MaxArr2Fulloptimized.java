package twopointerslidingwindow;

import java.util.Scanner;

public class MaxArr2Fulloptimized {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int n = s.nextInt();
		int[] arr = new int[n];
		
		int k =2;
		System.out.println("enter" + n+ "elements");
		for(int i=0; i<n; i++) {
			arr[i]= s.nextInt();
		}
		
		int max = MaxarrayTwo(arr, k);
		System.out.println(max);
	}

	private static int MaxarrayTwo(int[] arr, int k) {
		// TODO Auto-generated method stub
		int l=0;int  r=0; int maxlength=0; int zero=0; int len=0;
		int n = arr.length;
		while(r<n) {
			if(arr[r]==0) {
				zero++;
			}
			if(zero>k) {
				if(arr[l]==0) {
					zero--;
				}
				l++;
			}
			if(zero<=k) {
				len = r-l+1;
				maxlength = Math.max(maxlength, len);
			}
			
			r++;
			
		}
		return maxlength;
	}


}
