import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];

        int second = 1;
        int currPos = 0;
        for (int i = 0; i < N; i++) {
            char direction = sc.next().charAt(0);
            int x = sc.nextInt();
            
            if (direction == 'R') {
                for (int j = second; j < second + x; j++) {
                    arr1[j] = ++currPos;
                }
            } else {
                for (int j = second; j < second + x; j++) {
                    arr1[j] = --currPos;
                }
            }

            second += x;
        }

        second = 1;
        currPos = 0;
        for (int i = 0; i < M; i++) {
            char direction = sc.next().charAt(0);
            int x = sc.nextInt();
            
            if (direction == 'R') {
                for (int j = second; j < second + x; j++) {
                    arr2[j] = ++currPos;
                }
            } else {
                for (int j = second; j < second + x; j++) {
                    arr2[j] = --currPos;
                }
            }

            second += x;
        }

        // 두 배열을 비교하여 처음 만나는 순간 구하기
        int result = -1;
        for (int i = 1; i < 1001; i++) {
            if (arr1[i] == arr2[i]) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}