import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] pos = new char[3];
        for (int i = 0; i < 3; i++) {
            pos[i] = (char)('A' + i);
        }

        int[][] arr= new int[N][3];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt() - 1;
            arr[i][1] = sc.nextInt() - 1;
            arr[i][2] = sc.nextInt() - 1;
        }

        int max = 0;
        // i: 처음 조약돌의 위치
        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            char[] copiedPos = new char[3];
            for (int j = 0; j < 3; j++) {
                copiedPos[j] = pos[j];
            }

            for (int j = 0; j < N; j++) {
                // 위치를 변경할 번호
                int a = arr[j][0];
                int b = arr[j][1];
                // 확인할 종이컵 번호
                int c = arr[j][2];

                // 2개의 종이컵 위치를 변경
                char tmp = copiedPos[a];
                copiedPos[a] = copiedPos[b];
                copiedPos[b] = tmp;

                // 종이컵 확인 시 조약돌이 존재하면 개수를 증가
                if (copiedPos[c] == pos[i])
                    cnt++;
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}