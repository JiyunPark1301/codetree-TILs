import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x == m)
                cnt++;
        }

        System.out.println(cnt);
    }
}