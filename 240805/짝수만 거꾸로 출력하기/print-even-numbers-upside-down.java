import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                arr[index] = x;
                index++;
            }
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}