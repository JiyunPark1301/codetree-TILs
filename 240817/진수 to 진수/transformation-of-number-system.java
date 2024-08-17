import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            num = num * a + (n.charAt(i) - '0');
        }
        
        int cnt = 0;
        int[] arr = new int[20];
        while(true) {
            if (num < b) {
                arr[cnt] = num;
                break;
            }
            arr[cnt++] = num % b;
            num /= b;
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}