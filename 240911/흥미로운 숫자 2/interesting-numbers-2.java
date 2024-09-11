import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int result = 0;
        for (int i = X; i <= Y; i++) {
            int value = i;
            int sameCnt = String.valueOf(i).length() - 1;
            int[] arr = new int[10];

            while(true) {
                arr[value % 10]++;
                if (value < 10)
                    break;
                value /= 10;
            }

            int max = Integer.MIN_VALUE;
            for (int j = 0; j < 10; j++) {
                max = Math.max(max, arr[j]);
            }

            if (max == sameCnt)
                result++;
        }

        System.out.println(result);
    }
}