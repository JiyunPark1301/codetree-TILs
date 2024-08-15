import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}