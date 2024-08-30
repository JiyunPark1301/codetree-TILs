import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] arr = new char[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        int cnt = 0;
        for (int i = 1; i < C - 2; i++) {
            for (int j = 1; j < R - 2; j++) {
                for (int k = i + 1; k < C - 1; k++) {
                    for (int r = j + 1; r < R - 1; r++) {
                        if (arr[0][0] == 'W' && arr[R-1][C-1] == 'B') {
                            if (arr[i][j] == 'B' && arr[k][r] == 'W')
                                cnt++;
                        } else if (arr[0][0] == 'B' && arr[R-1][C-1] == 'W') {
                            if (arr[i][j] == 'W' && arr[k][r] == 'B')
                                cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}