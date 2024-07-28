import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int v = 1;
        while (true) {
            n /= v;
            if (n <= 1)
                break;
            v++;
        }
        System.out.print(v);
    }
}