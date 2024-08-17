import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String[] yoil = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int x = d1;
        for (int i = 1; i <= m1; i++) {
            x += days[i];
        }

        int y = d2;
        for (int i = 1; i <= m2; i++) {
            y += days[i];
        }
        int diff = y - x;
        while (diff < 0) {
            diff += 7;
        }
        
        System.out.println(yoil[diff % 7]);
    }
}