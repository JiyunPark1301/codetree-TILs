import java.util.*;

public class Main {
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int T = sc.nextInt();
        String str = sc.next();

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = N / 2, y = N / 2;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int result = arr[x][y];
        int dirNum = 0;
        for (int i = 0; i < T; i++) {
            char c = str.charAt(i);
            if (c == 'L') {
                dirNum = (dirNum + 3) % 4;
            } else if (c == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                int curX = x + dx[dirNum];
                int curY = y + dy[dirNum];
                if (!inRange(curX, curY))
                    continue;
                
                x = curX;
                y = curY;
                result += arr[x][y];
            }
        }

        System.out.print(result);
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}