package practiceforinterview;

public class Fibbo {
    public static void main(String[] args) {

        int arr[] = new int[5];

        int a = 0;
        int b = 1;
        // System.out.println(a);
        // System.out.println(b);
        for (int i = 0; i < 5; i++) {

            
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }
    }
}
