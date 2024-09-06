import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //밭의 개수
        int H = sc.nextInt(); //최소 횟수
        int T = sc.nextInt(); //밭의 높이
        int[] costArr = new int[N]; //H높이로 나오게끔 하는 최소 비용

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            costArr[i] = Math.abs(x - T);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - H; i++) {
            int sum = 0;
            for (int j = i; j < i + H; j++) {
                sum += costArr[j];
            }
            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}