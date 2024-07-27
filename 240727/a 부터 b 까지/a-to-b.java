import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = a;

        for (int i = a; i <= b; i++) {
            if (v <= b)
                System.out.print(v + " ");

            if (i % 2 == 1) {
                v *= 2;
            } else {
                v += 3;
            }
        }
    }
}