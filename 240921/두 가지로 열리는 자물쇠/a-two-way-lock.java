import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrA = new int[3];
        int[] arrB = new int[3];

        for (int i = 0; i < 3; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            arrB[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if ((Math.abs(arrA[0] -  i) <= 2 || Math.abs(arrA[0] - i) >= N - 2) && (Math.abs(arrA[1] -  j) <= 2 || Math.abs(arrA[1] - j) >= N - 2) &&
                        (Math.abs(arrA[2] -  k) <= 2 || Math.abs(arrA[2] - k) >= N - 2))
                            cnt++;
                    
                    else if ((Math.abs(arrB[0] -  i) <= 2 || Math.abs(arrB[0] - i) >= N - 2) && (Math.abs(arrB[1] -  j) <= 2 || Math.abs(arrB[1] - j) >= N - 2) &&
                            (Math.abs(arrB[2] -  k) <= 2 || Math.abs(arrB[2] - k) >= N - 2))
                            cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
} 

// 1 2 3 4 5 6 7 8 9 10   1 2 3