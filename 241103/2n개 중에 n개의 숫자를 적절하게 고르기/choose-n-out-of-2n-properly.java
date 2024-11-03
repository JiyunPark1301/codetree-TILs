import java.util.*;

public class Main {
    static final int INT_MAX = Integer.MAX_VALUE;
    static int n;
    static int[] arr;
    static int totalSum;
    static int answer = INT_MAX;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void dfs(int idx, int sum) {
        if (idx == 2 * n) {
            if (list.size() == n)
                answer = Math.min(answer, Math.abs(2 * sum - totalSum));
            return;
        }

        list.add(arr[idx]);
        dfs(idx + 1, sum + arr[idx]);

        list.remove(list.size() - 1);
        dfs(idx + 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        dfs(0, 0);
        System.out.println(answer);
    }
}