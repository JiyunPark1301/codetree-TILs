import java.util.Scanner;

public class Main {
    public static int[] arr = new int[100];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int idx = 1;
        System.out.println(getMax(max, idx));
    }

    public static int getMax(int max, int idx) {
        if (idx == n - 1)
            return max;
            
        if (max < arr[idx])
            max = arr[idx];
        return getMax(max, ++idx);
    }
}