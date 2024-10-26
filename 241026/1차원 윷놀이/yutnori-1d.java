import java.util.*;

public class Main {
    static int n, m, k;
    static int[] move;
    static ArrayList<Integer> list = new ArrayList<>();
    static int answer;

    public static void dfs(int idx) {
        if (idx == n) {
            int[] currentPos = new int[k + 1];
            for (int i = 1; i <= k; i++) {
                currentPos[i] = 1;
            }

            for (int i = 0; i < n; i++) {
                currentPos[list.get(i)] += move[i];
                if (currentPos[list.get(i)] > m) {
                    currentPos[list.get(i)] = m;
                }
            }

            int sum = 0;
            for (int i = 1; i <= k; i++) {
                if (currentPos[i] == m)
                    sum++;
            }

            answer = Math.max(sum, answer);
            return;
        }

        for (int i = 1; i <= k; i++) {
            list.add(i);
            dfs(idx + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //턴의 수
        m = sc.nextInt(); //윷놀이 판 상태
        k = sc.nextInt(); //말 수

        move = new int[n];
        for (int i = 0; i < n; i++) {
            move[i] = sc.nextInt();
        }

        dfs(0);

        System.out.println(answer);
    }
}