import java.util.*;

public class Main {
    static int N;
    static int[] check;
    static int answer;

    public static void dfs(int idx) {
        if (idx == N) {
            //아름다운 수인지 체크
            boolean isSatisfied = true;
            int skip = 1;
            for (int i = 0; i < N; i += skip) {
                int cnt = 0;
                for (int j = i; j < N; j++) {
                    if (check[i] == check[j])
                        cnt++;
                    else
                        break;
                }

                if (cnt % check[i] != 0) {
                    isSatisfied = false;
                    break;
                }

                skip = check[i];
            }

            if (isSatisfied) {
                answer++;
            }

            return;
        }

        for (int i= 1; i <= 4; i++) {
            check[idx] = i;
            dfs(idx + 1);
            //check[idx] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        check = new int[N];
        dfs(0);

        System.out.println(answer);
    }
}