package twopointerslidingwindow;

public class Marrarr2Brute {
	public static void main(String[] args) {
		int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		int len=0, maxlen=0;
		int n= arr.length;
		for(int i=0; i<n; i++) {
			int zero=0;
			for(int j=i; j<n;j++) {
				if(arr[j]==0) {
					zero++;
				}
				if(zero<=k) {
					len=j-i+1;
					maxlen = Math.max(maxlen, len);
					
					
				}
				else {
					break;
				}
			}
			
		
		}
		System.out.println(maxlen);
	}

}
