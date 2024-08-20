import java.util.*;

public class Main {
    public static int MAX_X = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[MAX_X][MAX_X];
        for(int i = 0; i < 3; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i == 2 && arr[j][k] == 0)
                        continue;
                    arr[j][k]++;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_X; j++) {
                if (arr[i][j] == 1)
                    area++;
            }
        }

        System.out.println(area);
    }
}