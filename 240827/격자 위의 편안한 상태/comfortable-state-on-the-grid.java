import java.util.*;

public class Main {
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][N];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            arr[x][y] = 1; //색칠하기

            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                int curX = x + dx[j];
                int curY = y + dy[j];

                // 범위 안에 있는 격자가 색칠되어 있다면, cnt 1 증가
                if (inRange(curX, curY) && arr[curX][curY] == 1) 
                    cnt++;
            }

            // cnt가 3개라면 편안한 상태
            if (cnt == 3)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < N && 0 <= y && y < N);
    }
}