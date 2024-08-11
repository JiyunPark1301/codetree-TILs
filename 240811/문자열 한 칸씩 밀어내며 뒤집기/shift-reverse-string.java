import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            if (n == 1) {
                str = str.substring(1) + str.substring(0, 1);
            } else if (n == 2) {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            } else if (n == 3) {
                str = new StringBuilder(str).reverse().toString();
            }

            System.out.println(str);
        }
    }
}