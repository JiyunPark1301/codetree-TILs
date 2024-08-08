import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal1 = arr[0];
        int idx1 = 0;
        for (int i = 1; i < N; i++) {
            if (maxVal1 < arr[i]) {
                maxVal1 = arr[i];
                idx1 = i;
            }
        }

        int maxVal2 = 0;
        boolean isInitialized = false;
        for (int i = 0; i < N; i++) {
            if (idx1 == i)
                continue;
            
            if (!isInitialized) {
                isInitialized = true;
                maxVal2 = arr[i];
            } else if (maxVal2 < arr[i]) {
                maxVal2 = arr[i];
            }
        }

        System.out.print(maxVal1 + " " + maxVal2);
    }
}