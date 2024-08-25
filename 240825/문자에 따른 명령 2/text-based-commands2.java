import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] dx = {1, 0, -1, 0}; //동남서북
        int[] dy = {0, -1, 0, 1};

        int x = 0, y = 0; //현재 좌표
        int dir = 3; //북

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'L') {
                dir = (dir + 3) % 4;
            } else if (c == 'R') {
                dir = (dir + 1) % 4;
            } else {
                x += dx[dir];
                y += dy[dir];
            }            
        }
        
        System.out.println(x + " " + y);
    }   
}