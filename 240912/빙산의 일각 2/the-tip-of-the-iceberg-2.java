import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //빙산 개수
        int[] H = new int[N]; //빙산 높이 배열
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i <= 1000; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (H[j] > i) {
                    if (j != 0 && H[j - 1] > i)
                        continue;
                    cnt++;
                }

            }
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
}