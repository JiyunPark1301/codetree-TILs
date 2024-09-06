import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //바구니 개수
        int K = sc.nextInt(); 

        int[] candy = new int[101];
        int minIdx = 101;
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int idx = sc.nextInt();

            candy[idx] += num;

            if (max < candy[idx]) {
                max = candy[idx];
                maxIdx = idx;
            }
            
            if (min > candy[idx]) {
                min = candy[idx];
                minIdx = idx;
            }
        }

        int startIdx = minIdx - K - K;
        int endIdx = maxIdx + K + K;

        int result = 0;
        for (int i = startIdx; i <= endIdx; i++) {
            int sum = 0;
            for (int j = i; j < i + 2 * K + 1; j++) {
                if (j < 0)
                    continue;
                sum += candy[j];
            }

            result = Math.max(sum, result);
        }

        System.out.println(result);
    }
}