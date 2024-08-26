import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int k = 0; k < 4; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];

                    if (inRange(x, y) && arr[x][y] == 1) {
                        cnt++;
                    }
                }

                if (cnt >= 3) 
                    result++;
            }
        }

        System.out.println(result);
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}