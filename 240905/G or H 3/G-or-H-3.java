import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt(); //사진의 크기

        int[] arr = new int[10001];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            //G:1점, H:2점
            if (c == 'G')
                arr[x] = 1;
            else
                arr[x] = 2;
        }

        int maxScore = 0;
        for (int i = 1; i < 10001 - K; i++) {
            int sum = 0;
            for (int j = i; j <= i + K; j++) {
                sum += arr[j];
            }

            maxScore = Math.max(maxScore, sum);
        }

        System.out.println(maxScore);
    }
}