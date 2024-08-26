import java.util.*;

public class Main {
    public static int n; 
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int[][] answer = new int[n][m];

        answer[0][0] = 1;
        int x = 0;
        int y = 0;
        int dirNum = 0;
        for (int i = 2; i <= n * m; i++) {
            int disX = x + dx[dirNum];
            int disY = y + dy[dirNum];

            if (!inRange(disX, disY) || answer[disX][disY] != 0)
                dirNum = (dirNum + 1) % 4;
            
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            answer[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}