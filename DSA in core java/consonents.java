import java.util.Scanner;

public class consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        String str = sc.next();
        int consonents = 0;
        int vovels = 0;

        // String Upper = str.toUpperCase();
        String lower = str.toLowerCase();

        for (char c : lower.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                vovels++;
            } else {
                consonents++;
            }
        }
        System.out.println(vovels);
        System.out.println(consonents);
    }
}
