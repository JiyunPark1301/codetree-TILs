import java.util.*;

public class Main {
    static int N, K;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void dfs(int idx) {
        if (idx == N) {
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            //연속하여 같은 숫자가 3번 이상 나오는 경우는 스킵한다.
            int currentIdx = list.size() - 1;
            if (currentIdx >= 1 && list.get(currentIdx) == i && list.get(currentIdx - 1) == i)
                continue;

            list.add(i);
            dfs(idx + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();

        dfs(0);
    }
}