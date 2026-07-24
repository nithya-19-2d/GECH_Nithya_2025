import java.util.Arrays;
import java.util.Scanner;

public class largearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter a number of elements");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];

            } else {
                if (sec_max < max && arr[i] > sec_max) {
                    sec_max = arr[i];
                }
            }

        }
        System.out.println("max" + max);
        System.out.println("second max is " + sec_max);
        System.out.println(Arrays.toString(arr));
    }
}
