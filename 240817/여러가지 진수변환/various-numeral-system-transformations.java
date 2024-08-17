import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[10];
        int cnt = 0;
        while(true) {
            if (N < B) {
                arr[cnt] = N;
                break;
            }

            arr[cnt++] = N % B;
            N /= B;
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}