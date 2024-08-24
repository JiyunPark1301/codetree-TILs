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

        int leader = 0; // 선두가 0이라는 것은 선두가 없거나, A=B가 같다는 뜻
        int cnt = 0;
        for (int i = 1; i < hour; i++) {
            // B가 선두인 경우
            if (arrA[i] < arrB[i]) {

                // 기존에 A가 선두였다면
                // 선두가 변경된 것이므로 cnt를 증가시킨다.
                if (leader == 1)
                    cnt++;
                
                // 현재 선두는 B가 된다.
                leader = 2;
            } else if (arrA[i] > arrB[i]) {
                // A가 선두인 경우

                // 기존에 B가 선두였다면
                // 선두가 변경된 것이므로 cnt를 증가시킨다.
                if (leader == 2)
                    cnt++;

                // 현재 선두는 A가 된다.
                leader = 1;
            }
        }

        System.out.print(cnt);
    }
}