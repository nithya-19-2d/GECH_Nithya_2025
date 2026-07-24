package practiceforinterview;

public class Recursepali {
    public static int pali(int num) {
        if (num > 0) {
            String res = String.valueOf(num);
            String rev = "";
            for (int i = res.length() - 1; i >= 0; i--) {
                rev += res.charAt(i);
            }
            // int digits = num%10;
            // return digits + pali(num/10);
            int not = Integer.parseInt(rev);
            return not;

        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = 121;
        int result = pali(n);
        System.out.println(result);
        

        if(n==result){
            System.out.println("is a palindrome");
        }
        else{
            System.err.println("is not a palindrome");
        }
    }
}
