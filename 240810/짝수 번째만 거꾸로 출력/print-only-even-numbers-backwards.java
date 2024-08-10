import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1)
                result += str.charAt(i);
        }

        for (int i = result.length() - 1; i >= 0 ;i--) {
            System.out.print(result.charAt(i));
        }
    }
}