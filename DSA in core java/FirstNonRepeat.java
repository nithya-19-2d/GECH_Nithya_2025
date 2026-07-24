import java.util.Scanner;

public class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeating character: " + c);
                // sc.close();
                // return;
            }
            return;
        }

        System.out.println("No unique character found");
        sc.close();

    }
}
