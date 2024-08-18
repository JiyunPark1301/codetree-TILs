import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1; j <= x2; j++) {
                arr[j] += 1;
            }
        }

        int max = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}