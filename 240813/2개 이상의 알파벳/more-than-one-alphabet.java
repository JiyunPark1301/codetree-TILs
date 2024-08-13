import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (hasDifferentLetters(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean hasDifferentLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(0)) {
                return true;
            }
        }

        return false;
    }
}