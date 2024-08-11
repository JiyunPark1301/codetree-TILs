import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i))
                sum += i;
        }
        System.out.print(sum);
    }

    public static boolean isPrime(int i) {
        for (int j = 1; j < i; j++) {
            if (i == 1 || i % j == 0)
                return false;
        }
        return true;
    }
}