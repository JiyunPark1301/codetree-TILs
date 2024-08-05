import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x == 0)
                break;
            if (x % 2 == 0) {
                arr[i] = x;
                sum += arr[i];
                cnt++;
            }
        }  
        System.out.printf("%d %d", cnt, sum);  
    }
}