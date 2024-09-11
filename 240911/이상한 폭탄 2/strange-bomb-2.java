import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] != arr[j])
                    continue;
                
                int dis = Math.abs(j - i);
                if (dis <= K) {
                    max = Math.max(max, arr[j]);
                }
            }
        }

        System.out.println(max);
    }
}