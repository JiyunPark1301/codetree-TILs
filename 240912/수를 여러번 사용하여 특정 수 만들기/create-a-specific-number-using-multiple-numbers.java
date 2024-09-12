import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = 0;
        for (int i = 0; i <= C / A; i++) {
            for (int j = 0; j <= C / B; j++) {
                int value = A * i + B * j;
                if (value <= C) {
                    max = Math.max(value, max);
                }
            }
        }

        System.out.println(max);
    }
}