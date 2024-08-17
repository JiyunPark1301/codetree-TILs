import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int num = 0;
        for (int i = 0; i < N.length(); i++) {
            num = num * 2 + (N.charAt(i) - '0');
        }

        num *= 17;
        int cnt = 0;
        int[] arr = new int[20];
        while(true) {
            if (num < 2) {
                arr[cnt] = num;
                break;
            }
            arr[cnt++] = num % 2;
            num /= 2;
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}