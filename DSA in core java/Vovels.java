import java.util.Scanner;

public class Vovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        String str = sc.next();
        int consonents = 0;
        int vovels = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' || c >= 'A' && c <= 'z' || c <= 'Z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                        || c == 'O' || c == 'U') {
                    vovels++;
                } else {
                    consonents++;
                }

            }
        }

        System.out.println("vowels" + vovels);
        System.out.println(consonents + "consonets");
    }
}
