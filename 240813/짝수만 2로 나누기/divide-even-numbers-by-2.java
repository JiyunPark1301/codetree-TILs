import java.util.Scanner;

public class Main {
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        printResult(arr);
    }

    public static void printResult(int[] arr) {
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0)
                arr[i] /= 2;
            
            System.out.print(arr[i] + " ");
        }
    }
}