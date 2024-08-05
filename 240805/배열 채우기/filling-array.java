import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                cnt = i - 1;
                break;
            }
            arr[i] = x;
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}