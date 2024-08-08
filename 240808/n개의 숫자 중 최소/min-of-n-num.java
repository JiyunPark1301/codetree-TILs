import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int minVal = sc.nextInt();
        int[] arr = new int[N];
        arr[0] = minVal;

        for (int i = 1; i < N; i++) {
            arr[i] = sc.nextInt();
            if (minVal > arr[i])
                minVal = arr[i];
        }
        
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == minVal)
                cnt++;
        }

        System.out.print(minVal + " " + cnt);
    }
}