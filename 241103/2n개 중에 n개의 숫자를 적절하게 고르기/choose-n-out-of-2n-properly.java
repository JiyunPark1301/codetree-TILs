import java.util.*;

public class Main {
    static final int INT_MAX = Integer.MAX_VALUE;
    static int n;
    static int[] arr;
    static int totalSum;
    static int answer = INT_MAX;

    public static void dfs(int idx, int sum, int cnt) {
        if (idx == 2 * n) {
            if (cnt == n)
                answer = Math.min(answer, Math.abs(2 * sum - totalSum));
            return;
        }

        dfs(idx + 1, sum + arr[idx], cnt + 1);
        dfs(idx + 1, sum, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        dfs(0, 0, 0);
        System.out.println(answer);
    }
}