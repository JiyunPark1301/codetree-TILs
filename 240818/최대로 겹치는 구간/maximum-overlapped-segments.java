import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[200];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;

            for (int j = x1; j < x2; j++) {
                arr[j] += 1;
            } 
        }

        int max = arr[0];
        for (int i = 1; i < 200; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}