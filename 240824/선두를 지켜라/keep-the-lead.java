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
                arrA[j] += arrA[j - 1] + v;
            }

            hour += t;
        }

        int[] arrB = new int[MAX_IDX];
        hour = 1;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt(); // 속도
            int t = sc.nextInt(); // 시간

            for (int j = hour; j < hour + t; j++) {
                arrB[j] += arrB[j - 1] + v;
            }

            hour += t;
        }

        boolean isInitialized = false;
        String isFirst = "";
        String prevFirst = "";
        int cnt = 0;
        for (int i = 1; i < hour; i++) {
            if (!isInitialized) {
                if (arrA[i] < arrB[i]) {
                    prevFirst = "B";
                    isInitialized = true;
                } else if (arrA[i] > arrB[i]){
                    prevFirst = "A";
                    isInitialized = true;
                }
            }    

            if (arrA[i] < arrB[i]) {
                isFirst = "B";
            } else if (arrA[i] > arrB[i]){
                isFirst = "A";
            }

            if (!isFirst.equals(prevFirst)) {
                cnt++;
                prevFirst = isFirst;
            }
            
        }

        System.out.print(cnt);
    }
}