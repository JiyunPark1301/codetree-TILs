import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //움직인 횟수
        int[] dx = {1, 0, -1, 0}; //동남서북
        int[] dy = {0, -1, 0, 1}; 

        int x = 0, y = 0; //현재 좌표
        for (int i = 0; i < N; i++) {
            char dir = sc.next().charAt(0); //방향
            int dis = sc.nextInt(); //움직인거리

            if (dir == 'N') {//북
                x += dx[3] * dis;
                y += dy[3] * dis;
            } else if (dir == 'E') {//동
                x += dx[0] * dis;
                y += dy[0] * dis;
            } else if (dir == 'S') {//남
                x += dx[1] * dis;
                y += dy[1] * dis;
            } else if (dir == 'W') {//서
                x += dx[2] * dis;
                y += dy[2] * dis;
            }
        }

        System.out.print(x + " " + y);
    }
}