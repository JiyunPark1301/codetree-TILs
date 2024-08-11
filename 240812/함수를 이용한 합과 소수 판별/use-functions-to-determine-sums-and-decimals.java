import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            // 소수이면서 모든 자릿수의 합이 짝수인 것을 만족
            if (isPrime(i) && isEven(i)) 
                cnt++;
        }
        System.out.print(cnt);
    }

    public static boolean isPrime(int a) {
        // 1은 소수가 아니다.
        if (a == 1)
            return false;
        
        // 2 ~ a-1까지 하나라도 나누어지는 값이 있다면 소수가 아니다.
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }

        return sum % 2 == 0;
    }   
}