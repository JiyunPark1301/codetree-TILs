import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumVal = 0;
        int cnt = 0;
        for (int i = 1; i <= 10; i++) {
            int x = sc.nextInt();
            if (x >= 0 && x <= 200) {
                sumVal += x;
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sumVal, (double)sumVal/cnt);
    }
}