import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        int dirNum = 0;
        int[][] arr = new int[n][n];

        int x = n - 1, y = n - 1;
        for (int i = n * n; i >= 1; i--) {
            arr[x][y] = i;

            int curX = x + dx[dirNum];
            int curY = y + dy[dirNum];

            if (!inRange(curX, curY) || arr[curX][curY] != 0)
                dirNum = (dirNum + 1) % 4;
            
            x = x + dx[dirNum];
            y = y + dy[dirNum];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}