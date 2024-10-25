import java.util.*;

public class Main {
    static int K, N;
    static int[] arr;

    public static void dfs(int idx) {
        if (idx == N) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            return;
        }

        for (int i = 1; i <= K; i++) {
            arr[idx] = i;
            dfs(idx + 1);
            arr[idx] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        arr = new int[N];

        dfs(0);
    }
}