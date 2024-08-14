import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N % 2 == 1)
            System.out.println(getOddSum(N));
        else
            System.out.println(getEvenSum(N));
    }

    public static int getOddSum(int N) {
        if (N == 1)
            return 1;
        if (N % 2 == 1)
            return getOddSum(N - 1) + N;
        return getOddSum(N - 1);
    }

    public static int getEvenSum(int N) {
        if (N == 2)
            return 2;
            
        if (N % 2 == 0)
            return getEvenSum(N - 1) + N;
        return getEvenSum(N - 1);
    }
}