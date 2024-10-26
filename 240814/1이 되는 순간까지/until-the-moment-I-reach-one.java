import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(getResult(N));
    }

    public static int getResult(int N) {
        if (N == 1)
            return 0;

        if (N % 2 == 0)
            return getResult(N / 2) + 1;
        else
            return getResult(N / 3) + 1;
    } 
}