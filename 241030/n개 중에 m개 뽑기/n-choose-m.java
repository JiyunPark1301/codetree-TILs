import java.util.*;

public class Main {
    static int N, M;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void dfs(int idx, int s) {
        if (idx == M) {
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();

            return;
        }

        for (int i = s; i <= N; i++) {
            list.add(i);
            dfs(idx + 1, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        dfs(0, 1);
    }
}