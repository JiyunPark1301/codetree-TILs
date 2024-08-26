import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        //현재 위치
        int x = 0;
        int y = 0;
        int second = 0;
        for (int i = 0; i < N; i++) {
            char c = sc.next().charAt(0);
            int dirNum = getDirNum(c); //움직인 방향
            int dis = sc.nextInt(); //움직인 거리
            
            boolean isSatisfied = false;
            for (int j = 0; j < dis; j++) {
                x = x + dx[dirNum];
                y = y + dy[dirNum];

                second++;
                if (x == 0 && y == 0) {
                    isSatisfied = true;
                    break;
                }
            }

            if (isSatisfied)
                break;
        }

        System.out.println(second);
    }

    public static int getDirNum(char c) {
        if (c == 'N')
            return 3;
        if (c == 'E')
            return 0;
        if (c == 'S')
            return 1;
        return 2;
    }
}