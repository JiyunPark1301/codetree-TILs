import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(getResult(N));
    }

    public static int getResult(int N) {
        if (N < 10)
            return N * N;
        return getResult(N / 10) + (N % 10) * (N % 10);
    }
}