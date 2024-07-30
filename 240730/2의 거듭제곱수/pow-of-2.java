import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int res = 1;
        int x = 0;
        while (true) {
            res *= 2
            x++;

            if (res == N)
                break;
        }

        System.out.println(x);
    }
}