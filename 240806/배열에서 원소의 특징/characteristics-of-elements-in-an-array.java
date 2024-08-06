import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idx = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x % 3 == 0) {
                idx = i;
                break;
            }
            arr[i] = x;
        }
        System.out.println(arr[idx - 1]);
    }
}