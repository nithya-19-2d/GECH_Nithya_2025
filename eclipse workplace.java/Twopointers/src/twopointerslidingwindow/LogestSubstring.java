package twopointerslidingwindow;

public class LogestSubstring {
	
	public static void main(String[] args) {
		String s = "cadbzefabcd";
		
		int max = Maxstring(s);
		System.out.println(max);
	}

	private static int Maxstring(String s) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		int maxlength =0;
		int len =0;
		int l =0;
		int r=0;
		int n = s.length();
		int[] hash = new int[256];
		
		while(r<n) {
			hash[255]=-1;
			if(hash[c[r]]!= -1) {
				if(hash[c[r]]>=l) {
					l = hash[c[r]]+1;
				}
			}
			len = r-l+1;
			maxlength = Math.max(maxlength, len);
			hash[c[r]] = r;
			r++;
			
		}
		return maxlength;
	}

}
