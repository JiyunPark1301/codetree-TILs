import java.util.Scanner;

public class Main {
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int startIdx = sc.nextInt() - 1;
            int endIdx = sc.nextInt() - 1;

            System.out.println(getSum(startIdx, endIdx));
        }
    }

    public static int getSum(int startIdx, int endIdx) {
        int sum = 0;
        for (int j = startIdx; j <= endIdx; j++) {
            sum += arr[j];
        }

        return sum;
    }
}