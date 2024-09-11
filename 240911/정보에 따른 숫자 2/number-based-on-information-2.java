import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[1001];

        for (int i = 0; i < T; i++) {
            char c = sc.next().charAt(0);
            int val = sc.nextInt();

            if (c == 'S') {
                arr[val] = 1;
            } else {
                arr[val] = 2;
            }
        }

        int result = 0;
        for (int i = a; i <= b; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for (int j = a; j <= b; j++) {
                int dis = Math.abs(i - j);
                if (arr[j] == 1) {
                    min1 = Math.min(dis, min1);
                } else if (arr[j] == 2) {
                    min2 = Math.min(dis, min2);
                }
            }
            if (min1 <= min2)
                result++;
        }

        System.out.println(result);
        
    }
} 

//x = k로부터 가장 가까이에 있는 알파벳 S까지의 거리 d1
//x = k로부터 가장 가까이에 있는 알파벳 N까지의 거리 d2
//d1 <= d2인 경우 x = k는 특별한 위치

// S 10