import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        findLcm(n, m);
    }

    public static int findGcd(int n, int m) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void findLcm(int n, int m) {
        // 최대공약수를 먼저 구한다.
        int gcd = findGcd(n, m);

        // 최대공약수의 배수를 구한다.
        // 위의 값은 n,m의 가장 작은 배수여야 최소공배수를 만족한다.
        int i = 1;
        while(true) {
            int val = gcd * i++;
            // n,m의 배수인지 판단하기 위해서는 나머지 연산을 사용한다.
            if (val % n == 0 && val % m == 0) {
                System.out.print(val);
                break;
            }
        }
    }
}