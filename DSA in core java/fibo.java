import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of terms");
        int n = sc.nextInt();
        int first = 0, second = 1;
        int next;
        for (int i = 0; i <= n - 1; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println(next);

        }
    }
}
