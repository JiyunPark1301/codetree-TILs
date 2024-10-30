import java.util.*;

public class Main {
    static final int MAX = Integer.MAX_VALUE;
    static int n;
    static int[] arr;
    static int answer = MAX;

    public static boolean inRange(int idx) {
        return idx < n;
    }

    public static void dfs(int idx, int jumpCnt) {
        if (idx == n - 1) {
            answer = Math.min(answer, jumpCnt);
            return;
        }

        for (int i = 1; i <= arr[idx]; i++) {
            if (inRange(idx + i)) {
                dfs(idx + i, jumpCnt + 1);
            }
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

        if (answer == MAX)
            System.out.println(-1);
        else
            System.out.println(answer);
    }
}