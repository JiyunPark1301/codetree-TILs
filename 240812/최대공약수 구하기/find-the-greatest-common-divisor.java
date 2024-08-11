import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getGCD(n, m));
    }

    public static int getGCD(int n, int m) {
        int gcd = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0)
                gcd = i;
        }
        return gcd;
    }
}