import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] x1 = new int[N];
        int[] x2 = new int[N];

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        //다른 선분과 겹치지 않는 선분의 수를 구한다.
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            //i번째 선분이 다른 선분과 겹치지 않는지 확인한다.
            boolean isSatisfied = false;
            for (int j = 0; j < N; j++) {
                //자기 자신은 제외한다.
                if (i == j)
                    continue;

                //x1이 큰 쪽 선분이 x2가 더 작다면 겹치게 된다.
                if ((x1[i] <= x1[j] && x2[i] >= x2[j]) || (x1[i] >= x1[j] && x2[i] <= x2[j])) {
                    isSatisfied = true;
                    break;
                }
            }

            if (!isSatisfied)
                cnt++;
        }

        System.out.println(cnt);
    }
}