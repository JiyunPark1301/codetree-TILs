import java.util.*;

public class Main {
    public static int MAX_NM = 1000;
    public static int MAX_VT = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arrA = new int[MAX_NM * MAX_VT + 1];
        int hour = 1;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt(); //속도 ex)4
            int t = sc.nextInt(); //시간 ex)1

            for (int j = hour; j < hour + t; j++) { //2 ~ 3
                arrA[j] = arrA[j - 1] + v;
            }

            hour += t;
        }

        int[] arrB = new int[MAX_NM * MAX_VT + 1];
        hour = 1;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt(); 
            int t = sc.nextInt(); 

            for (int j = hour; j < hour + t; j++) { 
                arrB[j] = arrB[j - 1] + v;
            }

            hour += t;
        }

        int cnt = 0;
        for (int i = 1; i < hour; i++) {
            if (arrA[i-1] < arrB[i-1] && arrA[i] < arrB[i])
                continue;
            if (arrA[i-1] > arrB[i-1] && arrA[i] > arrB[i])
                continue;
            if (arrA[i-1] == arrB[i-1] && arrA[i] == arrB[i])
                continue;
            cnt++;
        }

        System.out.println(cnt);
    }
}