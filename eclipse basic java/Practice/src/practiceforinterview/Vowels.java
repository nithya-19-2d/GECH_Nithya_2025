package practiceforinterview;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		
		int vowels=0, digits=0, space=0, cononents=0;
		
		for(char ch : str.toCharArray()) {
			if(ch == ' ') {
				space++;
			}
			else if(ch>='a' && ch<='z') {
				cononents++;
			}
			else if(ch>='0' &&  ch<='9') {
				digits++;
			}
			else if("aeiouAEIOU".indexOf(ch)!=-1 ) {
				vowels++;
			}
		}
		
		System.out.println("Vovels:" +vowels);
		System.out.println("space:" +space);
		System.out.println("consonents:" +cononents);
		System.out.println("digits:" +digits);
		
		
	}

}
