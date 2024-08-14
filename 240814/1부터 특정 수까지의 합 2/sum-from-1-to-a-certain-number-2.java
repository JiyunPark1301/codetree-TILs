import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.print(getSum(N));
    }

    public static int getSum(int N) {
        if (N == 1)
            return 1;
        
        return getSum(N - 1) + N;
    }
}