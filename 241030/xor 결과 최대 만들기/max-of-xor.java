import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static ArrayList<Integer> list = new ArrayList<>();
    static int answer;

    public static void dfs(int idx, int s) {
        if (idx == m) {
            int xorSum = 0;
            for (int num : list) {
                xorSum ^= num;
            }
            answer = Math.max(answer, xorSum);

            return;
        }

        for (int i = s; i < n; i++) {
            list.add(arr[i]);
            dfs(idx + 1, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0, 0);

        System.out.println(answer);
    }
}