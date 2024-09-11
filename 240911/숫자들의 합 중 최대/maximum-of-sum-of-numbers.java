import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int max = Integer.MIN_VALUE;
        for (int i = X; i <= Y; i++) {
            int value = i;
            int sum = 0;
            while(true) {
                sum += value % 10;
                if (value < 10)
                    break;
                value /= 10;
            }
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}