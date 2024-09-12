import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = 0;
        for (int i = 0; i <= C / A; i++) {
            //A를 i번 곱한값
            int num = A * i;

            //C에서 A를 i번 곱한값을 B로 나눈다.
            //그러면, B가 곱해진 최대횟수를 구할 수 있다.
            int cntB = (C - num) / B;

            //B를 cntB번 곲한값을 더한다.
            num += cntB * B;

            max = Math.max(num, max);
        }

        System.out.println(max);
    }
}