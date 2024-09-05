import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 2; j++) {
                for (int k = 0; k < N; k++) {
                    for (int r = 0; r < N - 2; r++)  {
                        //행이 같고 겹치는 경우는 제외한다.
                        if (i == k && Math.abs(r - j) <= 2)
                            continue;

                        //1*3크기의 격자1: 동전의 수를 구한다.
                        int sum1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                        //1*3크기의 격자2: 동전의 수를 구한다.
                        int sum2 = arr[k][r] + arr[k][r + 1] + arr[k][r + 2];
                        //1*3크기의 격자 2개 범위 안에 있는 동전 개수의 최대값을 구한다. 
                        maxCnt = Math.max(sum1 + sum2, maxCnt);
                    }
                }
            }
        }

        System.out.println(maxCnt);
    }
}