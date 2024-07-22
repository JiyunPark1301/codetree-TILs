import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = a;

        if (b <= min) {
            min = b;
        }

        if (c <= min) {
            min = c;
        }

        System.out.print(a == min ? "1 " : "0 ");
        System.out.print(a == b && b == c ? 1 : 0);
    }
}