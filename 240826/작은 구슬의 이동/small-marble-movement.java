import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int t = sc.nextInt();
        
        // 현재위치(x, y)
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1; 
        char d = sc.next().charAt(0);
        int dirNum = getDirNum(d);

        int[][] arr = new int[n][n];
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        for (int i = 1; i <= t; i++) {
            int disX = x + dx[dirNum];
            int disY = y + dy[dirNum];

            if (!inRange(disX, disY)) {
                dirNum = 3 - dirNum; //방향 바꾸기
                continue; 
            }

            x = x + dx[dirNum];
            y = y + dy[dirNum];   
        }
        
        System.out.println((x + 1) + " " + (y + 1));
    }

    public static int getDirNum(char d) {
        if (d == 'U')
            return 2;
        if (d == 'D')
            return 1;
        if (d == 'R')
            return 0;
        
        return 3;
    }

    public static boolean inRange(int dx, int dy) {
        return (0 <= dx && dx < n && 0 <= dy && dy < n);
    }
}