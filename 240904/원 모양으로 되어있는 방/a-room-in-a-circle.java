import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int result = 0;
            int idx = 0;
            for (int j = i; j < i + N; j++) { //시작위치 
                result += arr[j % N] * idx++;
            }

            min = Math.min(result, min);
        }
        System.out.println(min);
    }
} 

//0 ~ 4
//1 ~ 5 (1, 2, 3, 4, 0) j % 5
//2 ~ 6 (2, 3, 4, 0, 1) 

// 2번방에서 시작
// 0 1 2 3 4
// 4 7 8 6 4
//(1 + 1) % 5 = 2
//(2 + 1) % 5 = 3
//(3 + 1) % 5 = 4
//(4 + 1) % 5 = 0
//(0 + 1) % 5 = 1

// 3번방에서 시작
// 0 1 2 3 4
// 4 7 8 6 4
//(2 + 1) % 5 = 3
//(3 + 1) % 5 = 4
//(4 + 1) % 5 = 0
//(0 + 1) % 5 = 1
//(1 + 1) % 5 = 2