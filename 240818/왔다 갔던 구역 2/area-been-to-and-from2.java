import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2000];

        int startIdx = 1000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'R') {
                for (int j = startIdx; j < x + startIdx; j++) {
                    arr[j] += 1;
                }
                startIdx += x;
            } else {
                for (int j = startIdx - 1; j >= startIdx - x; j--) {
                    arr[j] += 1; 
                }
                startIdx -= x;
            }   
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2)
                cnt++;
        }

        System.out.println(cnt);
    }
}