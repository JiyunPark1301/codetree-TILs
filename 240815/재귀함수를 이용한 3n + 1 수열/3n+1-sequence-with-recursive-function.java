import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getResult(n));
    }

    public static int getResult(int n) {
        if (n == 1)
            return 0;

        if (n % 2 == 0)
            n /= 2;
        else
            n = n * 3 + 1;
        return getResult(n) + 1;
    }
}