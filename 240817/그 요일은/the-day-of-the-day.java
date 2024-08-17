import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String yoil = sc.next();

        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] yoilArr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int x = d1;
        for (int i = 1; i < m1; i++) {
            x += days[i];
        }

        int y = d2;
        for (int i = 1; i < m2; i++) {
            y += days[i];
        }

        int idx = 0;
        for (int i = 0; i < yoilArr.length; i++) {
            if (yoil.equals(yoilArr[i])) {
                idx = i;
                break;
            }
        }
        int diff = y - x;
        int cnt = 0;
        for (int i = 1; i <= diff; i++) {
            if (7 * i - 7 + idx <= diff)
                cnt++;
        }

        System.out.println(cnt);
    }
}