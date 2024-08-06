import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int idx = 0;
        for (int i = 0; i < 100; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                idx = i;
                break;
            }
            arr[i] = x;
        }

        int result = arr[idx - 1] + arr[idx - 2] + arr[idx - 3];
        System.out.println(result);
    }
}