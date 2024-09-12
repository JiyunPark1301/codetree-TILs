import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            //하나의 숫자를 2배한다.
            arr[i] *= 2;

            for (int j = 0; j < N; j++) {
                int[] remaining = new int[N - 1];
                int idx = 0;
                for (int k = 0; k < N; k++) {
                    //하나의 숫자를 제외한다.
                    if (k == j)
                        continue;
                    
                    //제외하고 남은 숫자를 배열에 담는다.
                    remaining[idx++] = arr[k];
                }

                int sum = 0;
                for (int k = 0; k < N - 2; k++) {
                    //인접한 숫자간의 차의 합을 구한다.
                    sum += Math.abs(remaining[k] - remaining[k + 1]);
                }

                //합이 최소가 되는 값을 구한다.
                min = Math.min(sum, min);
            }

            //하나의 숫자를 2배로 만들어줬던 것을 다시 원래 숫자로 되돌린다.
            arr[i] /= 2;
        }

        System.out.println(min);
    }
}