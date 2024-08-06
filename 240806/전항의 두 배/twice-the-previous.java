import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        for (int i = 3; i < 11; i++) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }

        for (int i = 1; i < 11; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}