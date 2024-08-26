import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        String str = sc.next();
        int dirNum = 3; // 북쪽
        
        int x = 0; //현재 X좌표
        int y = 0; //현재 y좌표
        int second = 0;
        boolean isSatisfied = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            second++;
            if (c == 'L') {
                dirNum = (dirNum + 3) % 4;
            } else if (c == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                x += dx[dirNum];
                y += dy[dirNum];
                
                if (x == 0 && y == 0) {
                    isSatisfied = true;
                    break;
                }
            }
        }

        if (isSatisfied) {
            System.out.println(second);
        } else {
            System.out.println(-1);
        }
        
    }
}