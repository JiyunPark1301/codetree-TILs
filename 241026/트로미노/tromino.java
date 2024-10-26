import java.util.*;

public class Main {
    static int n, m;
    static int[][] board;
    static int answer;
    static Pair[][] arr = {
        {new Pair(-1, 0), new Pair(0, 0), new Pair(0, 1)},
        {new Pair(1, 0), new Pair(0, 0), new Pair(0, 1)},
        {new Pair(0, -1), new Pair(0, 0), new Pair(1, 0)},
        {new Pair(0, -1), new Pair(0, 0), new Pair(-1, 0)},
        {new Pair(0, -1), new Pair(0, 0), new Pair(0, 1)},
        {new Pair(-1, 0), new Pair(0, 0), new Pair(1, 0)}
    };

    static class Pair {
        int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void getAnswer(int x, int y, int type) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int nx = x + arr[type][i].x;
            int ny = y + arr[type][i].y;

            if (!inRange(nx, ny))
                return;
            
            sum += board[nx][ny];
        }

        answer = Math.max(sum, answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    getAnswer(j, k, i);
                }
            }
        }

        System.out.println(answer);
    }


}