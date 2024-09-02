import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100 * 1000 * 2 + 1];
        int N = sc.nextInt();

        int currPos = 100 * 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
             char c = sc.next().charAt(0);

             if (c == 'L') {
                for (int j = currPos; j >= currPos - x + 1; j--) {
                    arr[j] = 1; //흰색
                }

                currPos = currPos - x + 1;
             } else {
                for (int j = currPos; j <= currPos + x - 1; j++) {
                    arr[j] = 2; //검은색
                }

                currPos = currPos + x - 1;
             }
        }

        int white = 0, black = 0;
        for (int i = 0; i < 100 * 1000 * 2; i++) {
            if (arr[i] == 1)
                white++;
            else if (arr[i] == 2)
                black++;
        }

        System.out.println(white + " " + black);
    }
}