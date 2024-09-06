import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arrA = new int[N];
        int[] arrB = new int[M];
        int[] tmp = new int[M];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }   

        int result = 0;
        Arrays.sort(arrB); //오름차순 정렬

        for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j < M; j++) {
                tmp[j] = arrA[i + j];
            }
            Arrays.sort(tmp);

            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (tmp[j] == arrB[j])
                    cnt++;
            }
            if (cnt == M)
                result++;
        }

        System.out.println(result);
    }
}