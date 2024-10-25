import java.util.*;

public class Main {
    static int N;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 2; j++) {
                
                int sum = 0;
                for (int k = i; k <= i + 2; k++) {
                    for (int r = j; r <= j + 2; r++) {
                        sum += board[k][r];
                    }
                }

                max = Math.max(sum, max);
            }
        }

        System.out.println(max);
    }
}