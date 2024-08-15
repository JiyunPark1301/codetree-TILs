import java.util.Scanner;

public class Main {
    public static int[] arr = new int[10];
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
    
        int mul = 1;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            mul *= arr[i];
        }

        System.out.println(mul / getGcd(0));
    }

    public static int getGcd(int i) {
        if (i == N - 1)
            return 1;

        int x = arr[i];
        int result = 1;

        for (int j = i + 1; j <= N; j++) {
            int y = arr[j];
            for (int k = 2; k <= Math.min(x, y); k++) {
                if (x % k == 0 && y % k == 0)
                    result = k;
            }  
        }

        return getGcd(i + 1) * result;
    }
}