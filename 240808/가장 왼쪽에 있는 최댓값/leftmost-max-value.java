import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = N - 1;

        while (idx >= 0) {
            int max = -1;
            int maxIdx = -1;
            for (int i = 0; i <= idx; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    maxIdx = i;
                }
            }
            idx = maxIdx - 1;
            System.out.print(maxIdx + 1 + " ");
        }
    }
}