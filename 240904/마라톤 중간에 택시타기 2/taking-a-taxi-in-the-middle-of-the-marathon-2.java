import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //체크포인트 개수
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < N - 1; i++) {
            int distance = 0;

            int prevX = arr[0][0];
            int prevY = arr[0][1];
            for (int j = 1; j < N; j++) {
                if (i == j)
                    continue;
                
                int currX = arr[j][0];
                int currY = arr[j][1];

                distance += Math.abs(currX - prevX) + Math.abs(currY - prevY);
                prevX = currX;
                prevY = currY;
            }

            min = Math.min(min, distance);
        }

        System.out.println(min);
    }
} 

// A
// 1, N번을 제외한 한개의 체크포인트를 건너뜀
// (0,0), (8, 3), (11, -1), (10, 0)
// (0, 0), (11, -1), (10, 0) -> 2번 건너뜀
// 11 + 1 = 12
// 1 + 1 = 2
// -> 총 거리 : 14