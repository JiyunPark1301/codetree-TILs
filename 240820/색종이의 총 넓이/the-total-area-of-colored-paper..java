import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[200][200];
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;

            for (int j = x1; j < x1 + 8; j++) {
                for (int k = y1; k < y1 + 8; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                result += arr[i][j];
            }
        }

        System.out.println(result);
    }
}