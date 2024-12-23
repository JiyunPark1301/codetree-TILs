import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MIN_VAL = Integer.MIN_VALUE;
        int maxVal = MIN_VAL;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x > maxVal)
                maxVal = x;
        }
        System.out.println(maxVal);
    }
}