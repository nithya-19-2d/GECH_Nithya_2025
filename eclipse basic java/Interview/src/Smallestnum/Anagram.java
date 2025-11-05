package Smallestnum;

public class Anagram {
	public static void main(String[] args) {
		
		String s1 = "hii";
		String s2 = "hel";
		
		int num = s1.length();
		int num2 = s2.length();
		
		if(num == num2) {
			System.out.println("is a anagram");
		}
		else {
			System.out.println("not");
		}
		
		
	}

}
