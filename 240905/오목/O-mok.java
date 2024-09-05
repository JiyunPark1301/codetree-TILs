import java.util.*;

public class Main {
    public static final int DIR_NUM = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        boolean isSatisfied = false;
        //모든 칸을 순서대로 탐색한다.
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (arr[i][j] == 0) continue;
                
                for (int k = 0; k < DIR_NUM; k++) { //8방향
                    int cnt = 1;
                    int x = i;
                    int y = j;
                    while(true) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];
                        if (!inRange(nx, ny))
                            break;
                        if (arr[nx][ny] != arr[i][j])
                            break;
                        cnt++;
                        x = nx;
                        y = ny;
                    }

                    if (cnt == 5) {
                        System.out.println(arr[i][j]);
                        System.out.println((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
                        isSatisfied = true;
                        break;
                    }
                }

                if (isSatisfied)
                    break;
            }
            if (isSatisfied)
                break;
        }

        if (!isSatisfied) {
            System.out.println("0");
        }
    }

    //격자를 벗어나는지 체크
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < 19 && 0 <= y && y < 19;
    }
}