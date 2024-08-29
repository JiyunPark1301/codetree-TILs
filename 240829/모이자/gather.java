import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = INT_MAX;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int val = Math.abs(i - j);
                sum += arr[j] * val;
            }
            
            min = Math.min(sum, min);
        }

        System.out.print(min);
    }
}