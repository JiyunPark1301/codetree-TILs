import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        int total = 0;
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int r = 0; r < 6; r++) {
                        if (i == j || i == k || i == r || j == k || k == r || j == r)
                            continue;
                        int sum1 = arr[i] + arr[j];
                        int sum2 = arr[k] + arr[r];
                        int sum3 = total - sum1 - sum2;

                        int min = Math.min(Math.min(sum1, sum2), sum3);
                        int max = Math.max(Math.max(sum1, sum2), sum3);

                        result = Math.min(max - min, result);
                    }
                }
            }
        }

        System.out.println(result);
    }
}