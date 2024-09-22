import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int result = Integer.MAX_VALUE;
        boolean isSatisfied = false;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int r = k + 1; r < 5; r++) {
                        if (i == k || j == k || i == r || j == r)
                            continue;
                        int sum1 = arr[i] + arr[j];
                        int sum2 = arr[k] + arr[r];
                        int sum3 = total - sum1 - sum2;

                        if (sum1 == sum2 || sum2 == sum3 || sum1 == sum3)
                            continue;

                        int min = Math.min(Math.min(sum1, sum2), sum3);
                        int max = Math.max(Math.max(sum1, sum2), sum3);

                        result = Math.min(result, max - min);
                        isSatisfied = true;
                    }
                }
            }
        }

        if (!isSatisfied)
            System.out.println("-1");
        else
            System.out.println(result);
    }
}