import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > t) {
                cnt++;
            } else {
                cnt = 0;
            }
            
            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}