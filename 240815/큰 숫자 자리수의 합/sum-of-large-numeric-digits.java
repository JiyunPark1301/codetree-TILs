import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mul =  a * b * c;
        System.out.print(getSum(mul));
    }

    public static int getSum(int x) {
        if (x < 10)
            return x % 10;
        return getSum(x / 10) + (x % 10);
    }
}