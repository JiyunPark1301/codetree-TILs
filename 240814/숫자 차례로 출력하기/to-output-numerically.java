import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        getResult1(N);
        System.out.println();
        getResult2(N);
    }

    public static void getResult1(int N) {
        if (N == 0)
            return;
        getResult1(N - 1);
        System.out.print(N + " ");
    }

    public static void getResult2(int N) {
        if (N == 0)
            return;
        System.out.print(N + " ");
        getResult2(N - 1);
    }
}