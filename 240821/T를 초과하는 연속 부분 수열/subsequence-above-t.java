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

        int cnt = arr[0] > t ? 1 : 0;
        int max = cnt;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > t && arr[i] > t) {
                cnt++;
            } else {
                cnt = arr[i] > t ? 1 : 0;
            }
            
            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}