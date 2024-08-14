import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        printStars(N);
    }

    public static void printStars(int N) {
        if (N == 0)
            return;

        printStars(N - 1);
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}