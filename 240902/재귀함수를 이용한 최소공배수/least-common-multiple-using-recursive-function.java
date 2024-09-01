import java.util.Scanner;

public class Main {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(getLCMAll(N));
    }

    public static int getLCMAll(int n) {
        if (n == 1)
            return arr[1];

        return getLCM(getLCMAll(n - 1), arr[n]);
    }

    //두 수의 최소공배수를 구한다.(두 수를 곱한값/최대공약수)
    public static int getLCM(int a, int b) {
        int gcd = 1; //최대공약수
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return a * b / gcd;
    }
}