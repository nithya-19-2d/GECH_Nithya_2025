import java.util.Scanner;

public class Palindrom_recursion {

    public static boolean isPalindrome(String str, int i, int j) {

        if (i >= j) {
            return true;
        }

        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }

        return isPalindrome(str, i + 1, j - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        String str = sc.nextLine();
        // String str = "gadag";
        // char[] pali = str.toCharArray();
        // String rev = "";
        // for (int i = pali.length - 1; i >= 0; i--) {
        // rev += pali[i];
        // }

        // if (str.equals(rev)) {
        // System.out.println("is palindrome");
        // } else {
        // System.out.println("not a palindrome");
        // }

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not a palindrome");
        }

    }

}
