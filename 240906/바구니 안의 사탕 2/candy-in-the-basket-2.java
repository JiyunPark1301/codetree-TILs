import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //바구니 개수
        int K = sc.nextInt(); 

        int[] candy = new int[101];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int idx = sc.nextInt();

            candy[idx] += num;
        }

        int result = 0;
        for (int i = 0; i <= 100; i++) {
            int sum = 0;
            for (int j = i - K; j <= i + K; j++) {
                if (j < 0 || j > 100)
                    continue;
                sum += candy[j];
            }

            result = Math.max(sum, result);
        }

        System.out.println(result);
    }
}