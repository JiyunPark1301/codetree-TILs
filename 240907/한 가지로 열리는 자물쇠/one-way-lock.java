import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (i - arr[0] <= 2 || j - arr[1] <= 2 || k - arr[2] <= 2) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}