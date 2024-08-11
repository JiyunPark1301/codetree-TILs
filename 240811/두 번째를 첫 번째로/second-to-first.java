import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c2)
                str = str.substring(0, i) + c1 + str.substring(i + 1);
        }

        System.out.println(str);
    }
}