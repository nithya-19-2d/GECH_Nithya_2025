package twopointerslidingwindow;

import java.util.Arrays;

public class MiniSubWindow {

	public static void main(String[] args) {
		
		String s = "ddaaabbca";
		String t = "abc";
		
		String result = MinWindow(s, t);
		System.out.println(result);
	}

	private static String MinWindow(String s, String t) {
		// TODO Auto-generated method stub
		char[] st = s.toCharArray();
		char[] tr = t.toCharArray();
		int minlen = Integer.MAX_VALUE;
		int cnt = 0;
		int stindex = -1;
		int n= s.length();
		int m = t.length();
		int l=0;
		int r=0;
		int[] hash = new int[256];
		Arrays.fill(hash, 0);
		for(int i=0; i<m; i++) {
			hash[tr[i]]++;
		}
		while(r<n) {
			if(hash[st[r]]>0) {
				cnt = cnt+1;
				
			}
			hash[st[r]]--;
				
		while	(cnt==m){
			if(r-l+1<minlen) {
				minlen=r-l+1;
				stindex = l;
			}
			
			hash[st[l]]++;
			if(hash[st[l]]>0) {
				cnt = cnt-1;
			}
			l++;
		}
		r = r+1;
		}
		return (stindex == -1) ? " ": s.substring(stindex, stindex+minlen);
	}
	
}
