import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int maxSize = Integer.MIN_VALUE;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    //y축에 평행한 값이 없을 때
                    if (arr[i][0] != arr[j][0] && arr[j][0] != arr[k][0] && arr[i][0] != arr[k][0])
                        continue;
                    //x축에 평행한 값이 없을 때
                    if (arr[i][1] != arr[j][1] && arr[j][1] != arr[k][1] && arr[i][1] != arr[k][1])
                        continue;
                    
                    int x1 = arr[i][0];
                    
                    int size = Math.abs((arr[i][0] * arr[j][1] + arr[j][0] * arr[k][1] + arr[k][0] * arr[i][1]) - (arr[j][0] * arr[i][1] + arr[k][0] * arr[j][1] + arr[i][0] * arr[k][1]));
                    maxSize = Math.max(size, maxSize);               
               }
            }
        }

        System.out.println(maxSize);
    }
} 

/**
y축에 평행: x가 같은 값이 존재
x축에 평행 : y가 같은 값이 존재

(arr[i][0], arr[i][1]), (arr[j][0], arr[j][1]), (arr[k][0], arr[k][1])
1 / 2 * Math.abs((arr[i][0] * arr[j][1] + arr[j][0] * arr[k][1] + arr[k][0] * arr[i][1]) - 
(arr[j][0] * arr[i][1] + arr[k][0] * arr[j][1] + arr[i][0] * arr[k][1]))
*/