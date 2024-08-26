import java.util.*;

public class Main {
    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        arr[0][0] = 1;
        int dirNum = 1;
        int x = 0;
        int y = 0;
        for (int i = 2; i <= n * m ; i++) {
            int curX = x + dx[dirNum];
            int curY = y + dy[dirNum];
            
            if (!inRange(curX, curY) || arr[curX][curY] != 0)
                dirNum = (dirNum + 3) % 4;

            x += dx[dirNum];
            y += dy[dirNum];
            arr[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}