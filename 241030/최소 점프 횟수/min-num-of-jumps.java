import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int answer = Integer.MAX_VALUE;

    public static void dfs(int idx, int jumpCnt) {
        if (arr[idx] == 0) {
            answer = -1;
            return;
        }

        if (jumpCnt >= n) {
            answer = -1;
            return;
        }

        if (idx >= n - 1) {
            answer = Math.min(answer, jumpCnt);
            return;
        }

        for (int i = 0; i <= arr[idx]; i++) {
            dfs(idx + i, jumpCnt + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0, 0);

        System.out.println(answer);
    }
}