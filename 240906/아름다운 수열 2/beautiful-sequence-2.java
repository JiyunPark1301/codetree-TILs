import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arrA = new int[N];
        int[] arrB = new int[M];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }   

        int result = 0;
        int[] copiedArrB = Arrays.copyOf(arrB, M);
        Arrays.sort(copiedArrB); //오름차순 정렬

        for (int i = 0; i <= N - M; i++) {
            int[] copiedArrA = Arrays.copyOfRange(arrA, i, i + M);
            Arrays.sort(copiedArrA); //오름차순 정렬
            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (copiedArrA[j] == copiedArrB[j])
                    cnt++;
            }
            if (cnt == M)
                result++;
        }

        System.out.println(result);
    }
}