import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[1000001];
        int second1 = 1; // 초
        int curPos = 0; // 현재 위치
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // 몇칸 이동
            char direction = sc.next().charAt(0); // 방향

            for (int j = second1; j < second1 + x; j++) {
                if (direction == 'L') {
                    arrA[j] = --curPos;
                } else {
                    arrA[j] = ++curPos;
                }    
            }
            second1 += x;  
        }

        int[] arrB = new int[1000001];
        int second2 = 1; // 초
        curPos = 0; // 현재 위치
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(); // 몇칸 이동
            char direction = sc.next().charAt(0); // 방향

            for (int j = second2; j < second2 + x; j++) {
                if (direction == 'L') {
                    arrB[j] = --curPos;
                } else {
                    arrB[j] = ++curPos;
                }    
            }
            second2 += x;  
        }

        int end = Math.max(second1, second2);

        if (second1 != second2) {
            if (second1 == end) { 
                for (int i = second2; i < second1; i++) {
                    arrB[i] = arrB[second2 - 1];
                }
            } else {
                for (int i = second1; i < second2; i++) {
                    arrA[i] = arrA[second1 - 1];
                }
            }
        }

        int cnt = 0;
        for (int i = 1; i < end; i++) {
            if (arrA[i] == arrB[i]) {
                if (i != 1 && arrA[i - 1] == arrB[i - 1])
                    continue;
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}