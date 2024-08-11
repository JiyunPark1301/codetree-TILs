import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c1) {
                result += c2;
            } else if (str.charAt(i) == c2) {
                result += c1;
            } else {
                result += str.charAt(i);
            }
        }

        System.out.print(result);
    }
}