import java.util.*;

public class Main {
    static int n;
    static int r, c; //시작위치
    static int[][] board;
    static int[][] direction;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static boolean isFinished;
    static int answer;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void dfs(int idx, int x, int y) {
        //System.out.println(x + " " + y);
        int nx = x, ny = y;
        while(true) {
            nx = nx + dx[direction[x][y]];
            ny = ny + dy[direction[x][y]];

            if (!inRange(nx, ny)) {
                answer = Math.max(answer, idx);
                break;
            }
            
            if (board[nx][ny] <= board[x][y])
                continue;
            
            dfs(idx + 1, nx, ny);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        direction = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                direction[i][j] = sc.nextInt() - 1;
            }
        }

        r = sc.nextInt();
        c = sc.nextInt();

        dfs(0, r - 1, c - 1);

        System.out.println(answer);
    }
}