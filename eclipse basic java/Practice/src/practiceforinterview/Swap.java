package practiceforinterview;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println("the value of a :" + a);
        System.out.println("the value of b:" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" value of a:" + a + "and value of b" + b);

    }

}
