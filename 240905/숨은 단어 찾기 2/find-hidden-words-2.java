import java.util.*;

public class Main {
    public static int N;
    public static int M;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        
        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] != 'L')
                    continue;
                
                for (int k = 0; k < 8; k++) {
                    int cnt = 0;
                    int x = i;
                    int y = j;
                    for (int r = 0; r < 2; r++) {
                        int curX = x + dx[k];
                        int curY = y + dy[k];

                        if (!inRange(curX, curY))
                            break;
                        if (arr[curX][curY] != 'E') 
                            break;

                        cnt++;
                        x = curX;
                        y = curY;              
                    }

                    if (cnt == 2) 
                        result++;
                }
            }
        }

        System.out.println(result);
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }
}