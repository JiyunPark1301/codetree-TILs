import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = 100;
        for (int i = 0; i < n - 1; i++) {
            int minus = arr[i + 1] - arr[i];
            if (minus < min)
                min = minus;
        }
        System.out.print(min);
    }
}