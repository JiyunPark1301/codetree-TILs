import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(getResult(n));
    }

    public static int getResult(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        return getResult(n - 1) + getResult(n - 2);
    }
}