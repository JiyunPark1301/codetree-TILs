import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt;
        for (int i = 1; i <= n; i++) {
            cnt = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt = i * (j + 1);
            }
            System.out.println();
        }
    }
}