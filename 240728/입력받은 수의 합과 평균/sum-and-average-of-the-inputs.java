import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            sum += x;
        }
        System.out.printf("%d %.1f", sum, (double)sum/n);
    }
}