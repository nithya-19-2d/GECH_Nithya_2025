package StringsandArray;

import java.util.*;

public class Substringsum {
    public static void findSubarray(int[] arr, int target) {
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                if (sum == target) {
                    System.out.print("Subarray found: [");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr[k]);
                        if (k < end) System.out.print(", ");
                    }
                    System.out.println("]"); //this will print in the same line , but the another one next to this that will be print to the next line
                    System.out.print("completed"); //this will bein next line
                    System.out.println("hii"); //this will be in same line like this compltedhii
                    return; // stop after first match
                }
            }
        }
        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // input target sum
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // find subarray
        findSubarray(arr, target);

        sc.close();
    }
}

