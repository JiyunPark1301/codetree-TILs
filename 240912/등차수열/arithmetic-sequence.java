import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 

        int max = 0;
        for (int i = 1; i <= 100; i++) {
            int cnt = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr[j] + arr[k]) / (double)2 == i)
                        cnt++;
                }
            }
           
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
}