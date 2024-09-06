import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arrA = new int[N];
        int[] arrB = new int[M];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }   

        int result = 0;
        for (int i = 0; i <= N - M; i++) {
            int cnt = 0;
            for (int j = i; j < i + M; j++) {
                for (int k = 0; k < M; k++) {
                    if (arrB[k] == arrA[j])
                        cnt++;
                }
                if (cnt == M)
                    result++;
            }
        }

        System.out.println(result);
    }
}