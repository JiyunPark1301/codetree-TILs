import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N - 1; j++) {
                if (board[i][j] == board[i][j + 1])
                    cnt++;
                else
                    cnt = 1;

                if (cnt >= M) {
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N - 1; j++) {
                if (cnt == M) {
                    answer++;
                    break;
                }

                if (board[j][i] == board[j + 1][i])
                    cnt++;
                else
                    cnt = 1;
            }
        }

        System.out.println(answer);
    }
}