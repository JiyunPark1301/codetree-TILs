import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }        

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int[] working = new int[1001];
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                
                for (int k = arr[j][0]; k < arr[j][1]; k++) {
                    working[k] = 1;
                }
            }
            int sum = 0;
            for (int k = 1; k <= 1000; k++) {
                sum += working[k];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}