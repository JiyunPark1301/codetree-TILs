import java.util.*;

public class Main {
    static final int MAX_N = 15;
    static int n;
    static Pair[] arr = new Pair[MAX_N];
    static boolean[] visited = new boolean[MAX_N];
    static int[] check = new int[1001];
    static int answer;

    static class Pair {
        int x1;
        int x2;
        public Pair(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }
    }

    public static void dfs(int idx) {
        if (idx == n) {
            check = new int[1001];
            boolean isSatisfied = true;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (!visited[i])
                    continue;

                cnt++;

                //겹치는 선분이 있으면 안된다.
                for (int j = arr[i].x1; j <= arr[i].x2; j++) {
                    check[j]++;

                    if (check[j] > 1) {
                        isSatisfied = false;
                        break;
                    }
                }

                if (!isSatisfied)
                    break;
            }

            if (isSatisfied) {
                answer = Math.max(cnt, answer);
            }

            return;
        }

        visited[idx] = true;
        dfs(idx + 1);

        visited[idx] = false;
        dfs(idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            arr[i] = new Pair(x1, x2);
        }

        dfs(0);

        System.out.println(answer);
    }   
}