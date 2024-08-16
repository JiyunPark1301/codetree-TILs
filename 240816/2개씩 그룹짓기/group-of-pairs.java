import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[2 * N];

        for (int i = 0; i < 2 * N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = arr[0] + arr[2 * N - 1];
        for (int i = 1; i < N; i++) {
            if (max < arr[i] + arr[2 * N - 1 - i])
                max = arr[i] + arr[2 * N - 1 - i];
        }

        System.out.print(max);
    }
}