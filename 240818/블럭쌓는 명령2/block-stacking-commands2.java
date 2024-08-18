import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                arr[i] += 1;
            }
        }

        int max = arr[1];
        for (int i = 2; i <= N; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}