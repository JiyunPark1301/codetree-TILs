import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cntArr = new int[1000];
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            arr[i] = x;
            cntArr[x]++;
        }

        final int MIN_VAL = Integer.MIN_VALUE;
        int max = MIN_VAL;
        for (int i = 0; i < N; i++) {
            if (max < arr[i] && cntArr[arr[i]] <= 1) {
                max = arr[i];
            }
        }     

        if (max == MIN_VAL)
            System.out.print(-1);
        else
            System.out.print(max);
    }
}