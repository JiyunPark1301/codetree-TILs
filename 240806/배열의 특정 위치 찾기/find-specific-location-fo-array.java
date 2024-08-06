import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (i % 2 == 1) {
                sum1 += x;
            }
            if ((i + 1) % 3 == 0) {
                sum2 += x;
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum1, (double)sum2/cnt);
    }
}