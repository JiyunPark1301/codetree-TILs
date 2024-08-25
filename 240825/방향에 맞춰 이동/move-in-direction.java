import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //움직인 횟수
        int[] dx = {1, 0, -1, 0}; //동남서북
        int[] dy = {0, -1, 0, 1}; 

        int x = 0, y = 0; //현재 좌표
        for (int i = 0; i < N; i++) {
            char cdir = sc.next().charAt(0); //방향
            int dis = sc.nextInt(); //움직인거리

            int dir;
            if (cdir == 'N') {//북
                dir = 3;
            } else if (cdir == 'E') {//동
                dir = 0;
            } else if (cdir == 'S') {//남
                dir = 1;
            } else {//서
                dir = 2; 
            }

            x += dx[dir] * dis;
            y += dy[dir] * dis;
        }

        System.out.print(x + " " + y);
    }
}