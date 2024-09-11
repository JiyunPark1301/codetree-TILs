import java.util.*;

public class Main {
    public static int C;
    public static int G;
    public static int H;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //장비개수
        //작업량
        C = sc.nextInt();
        G = sc.nextInt();
        H = sc.nextInt();

        int[][] arr = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = -1; i <= 1001; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += getValue(i, arr[j][0], arr[j][1]);
            }
            max = Math.max(sum, max);
        }
        
        System.out.println(max);
    }

    public static int getValue(int temp, int Ta, int Tb) {
        if (temp < Ta)
            return C;
        else if (temp <= Tb)
            return G;
        return H;
    }
}