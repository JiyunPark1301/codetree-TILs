import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //학생수
        int B = sc.nextInt(); //예산
        int[] price = new int[N];

        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    sum += price[j] / 2;
                } else {
                    sum += price[j];
                }

                if (sum > B)
                    break;
                
                cnt++;
            }
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
}