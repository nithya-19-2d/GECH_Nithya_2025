import java.util.Scanner;

public class sumrec {

    static int Summation(int value) {

        if (value == 0) {
            return 0;
        }
        return (value % 10) + Summation(value / 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int total = Summation(num);

        System.out.println(total);
    }
}
