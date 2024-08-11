import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isSatisfied(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSatisfied(int n) {
        String str = Integer.toString(n);
        int val = str.charAt(0) - '0' + str.charAt(1) - '0';

        return n % 2 == 0 && val % 5 == 0;
    }
}