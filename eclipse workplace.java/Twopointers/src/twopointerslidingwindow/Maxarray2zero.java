package twopointerslidingwindow;

public class Maxarray2zero {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1,1,1,0};
		
		int k =2;
		
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
			while(zero>k) {
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
// two pointer/sliding window 
//time complexity is O(2n) , because two while loop O(n)+O(n)
//Sc = O(1) , not covering extra space
