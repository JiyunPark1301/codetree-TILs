import java.util.*;

public class Main {
    public static int MAX_IDX = 1000 * 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arrA = new int[MAX_IDX];
        int hour = 1;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt(); // 속도
            int t = sc.nextInt(); // 시간

            for (int j = hour; j < hour + t; j++) {
                arrA[j] += v;
            }

            hour += t;
        }

        int[] arrB = new int[MAX_IDX];
        hour = 1;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt(); // 속도
            int t = sc.nextInt(); // 시간

            for (int j = hour; j < hour + t; j++) {
                arrB[j] += v;
            }

            hour += t;
        }

        int cnt = 0;
        String prevFirst = (arrA[1] == arrB[1]) ? "" : (arrA[1] < arrB[1]) ? "B" : "A";
        String first = prevFirst;
        for (int i = 2; i < hour; i++) {
            if (arrA[i] < arrB[i]) {
                first = "B";
            } else if (arrA[i] > arrB[i]) {
                first = "A";
            }

            if (!prevFirst.equals(first)) {
                cnt++;
                prevFirst = first;
            }
        }

        System.out.print(cnt);
    }
}