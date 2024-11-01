import java.util.*;

public class Main {
    static final int MAX_M = 5;
    static int N, M, C;
    static int[][] weight;
    static int answer;
    static int[] a = new int[MAX_M];
    static int maxVal;

    public static void dfs(int idx, int currWeight, int currVal) {
        if (idx == M) {
            if (currWeight <= C)
                maxVal = Math.max(maxVal, currVal);
            return;
        }

        dfs(idx + 1, currWeight + a[idx], currVal + a[idx] * a[idx]);
        dfs(idx + 1, currWeight, currVal);
    }

    public static int findMax(int sx, int sy) {
        // 문제를 a[0] ~ a[M - 1]까지 M개의 숫자가 주어졌을 때
        // 적절하게 골라 무게의 합이 c를 넘지 않게 하면서 얻을 수 있는 최대 가치를 
        // 구하는 문제로 바꾸기 위해
        // a 배열을 적절하게 채워넣습니다. 
        for (int i = sy; i <= sy + M - 1; i++) {
            a[i - sy] = weight[sx][i];
        }

        maxVal = 0;
        dfs(0, 0, 0);
        return maxVal;
    }


    public static boolean possible(int sx1, int sy1, int sx2, int sy2) {
        //두 도둑이 훔치려는 물건의 범위가 격자를 벗어나는 경우에는 불가능하다.
        if (sy1 + M - 1 >= N || sy2 + M - 1 >= N)
            return false;

        //두 도둑이 훔치려는 위치의 행이 다르다면 겹칠 수 없으므로 무조건 가능
        if (sx1 != sx2)
            return true;

        //두 도둑이 훔치려는 구간이 겹치면 불가능하다.
        if ((sy1 <= sy2 && sy2 <= sy1 + M - 1) || (sy2 <= sy1 && sy1 <= sy2 + M - 1))
            return false;
        
        //행이 같으면서 구간끼리 겹치지 않으면 가능하다.
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();

        weight = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                weight[i][j] = sc.nextInt();
            }
        }

        //첫 번째 도둑은 (sx1, sy1) ~ (sx1, sy1 + M - 1)까지의 물건을 훔치려 하고
        //두 번째 도둑은 (sx2, sy2) ~ (sx2, sy2 + M - 1)까지의 물건을
        //훔치려 한다고 했을 때 가능한 모든 위치를 탐색해 본다.
        for (int sx1 = 0; sx1 < N; sx1++) {
            for (int sy1 = 0; sy1 < N; sy1++) {
                for (int sx2 = 0; sx2 < N; sx2++) {
                    for (int sy2 = 0; sy2 < N; sy2++) {
                        //두 도둑의 위치가 올바른지 판단한다.
                        if (possible(sx1, sy1, sx2, sy2))
                            answer = Math.max(answer, findMax(sx1, sy1) + findMax(sx2, sy2));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}