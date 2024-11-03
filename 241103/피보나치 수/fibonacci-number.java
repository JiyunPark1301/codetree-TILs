import java.util.*;

public class Main {
        static int n;
    static int[] dp;

    public static int fibbo(int n) {
        if (dp[n] != -1)
            return dp[n];

        if (n <= 2) {
            dp[n] = 1;
        } else {
            dp[n] = fibbo(n - 2) + fibbo(n - 1);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println(fibbo(n));
    }
}