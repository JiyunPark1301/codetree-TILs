import java.util.*;

public class Main {
    public static int N;
    public static int x, y; //시작위치
    public static int dirNum; //방향

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        char[][] arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int K = sc.nextInt(); //레이저를 쏘는 위치
        initialize(K); //시작위치와 방향을 지정

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int cnt = 0;
        while(inRange(x, y)) {
            if (arr[x][y] == '/') { 
                dirNum = 3 - dirNum;
            } else { 
                if (dirNum == 0 || dirNum == 2)
                    dirNum += 1;
                else
                    dirNum -= 1;
            }
            cnt++;
            x = x + dx[dirNum];
            y = y + dy[dirNum];
        }

        System.out.println(cnt);

    }

    //주어진 K의 값에 따라
    //시작 위치와 방향을 구한다.
    public static void initialize(int num) {
        if (num <= N) {
            x = 0;
            y = num - 1;
            dirNum = 1;
        } else if (num <= 2 * N) {
            x = num - N - 1;
            y = N - 1;
            dirNum = 0;
        } else if (num <= 3 * N) {
            x = N - 1;
            y = N - (num - N * 2);
            dirNum = 3;
        } else {
            x = N - (num - N * 3);
            y = 0;
            dirNum = 2;
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}