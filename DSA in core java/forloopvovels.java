import java.util.Scanner;

public class forloopvovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        String str = sc.next();
        int consonents = 0;
        int vovels = 0;

        String Lower = str.toLowerCase();

        for (int i = 0; i <= Lower.length() - 1; i++) {
            if ("aeiou".indexOf(Lower.charAt(i)) >= 0) {
                vovels++;
            } else {
                consonents++;
            }
        }

        System.out.println("vovwels" + vovels);
        System.out.println("consonents" + consonents);
    }
}
