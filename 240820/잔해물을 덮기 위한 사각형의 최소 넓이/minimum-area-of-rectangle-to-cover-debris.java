import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2000][2000];
        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt() + 1000;
            int y1 = sc.nextInt() + 1000;
            int x2 = sc.nextInt() + 1000;
            int y2 = sc.nextInt() + 1000;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    arr[j][k] = i + 1;
                }
            }
        }

        int minx = 2000;
        int miny = 2000;
        int maxx = -1;
        int maxy = -1;
        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (arr[i][j] == 1) {
                    if (minx > i)
                        minx = i;
                    if (miny > j)
                        miny = j;
                    if (maxx < i)
                        maxx = i;
                    if (maxy < j)
                        maxy = j;
                }
            }
        }

        int result = 0;
        for (int i = minx; i <= maxx; i++) {
            for (int j = miny; j <= maxy; j++) {
                result++;
            }
        }

        System.out.println(result);
    }
}