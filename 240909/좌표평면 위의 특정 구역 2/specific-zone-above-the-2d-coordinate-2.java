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

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int maxX = Integer.MIN_VALUE;
            int minX = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                
                maxX = Math.max(maxX, arr[j][0]);
                minX = Math.min(minX, arr[j][0]);
                maxY = Math.max(maxY, arr[j][1]);
                minY = Math.min(minY, arr[j][1]);
            }
            result = Math.min((maxX - minX) * (maxY - minY), result);
        }

        System.out.println(result);
    }
} 

/**
(2, 4), (1, 1), (5, 2), (17, 25)
maxX = 5, minX = 1
maxY = 4, minY = 1
(5 - 1) * (4 - 1) = 4 * 3 = 12
*/