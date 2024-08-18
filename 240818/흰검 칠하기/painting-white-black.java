import java.util.*;

public class Main {
    public static int MAX_N = 1000;
    public static int MAX_X = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] checked = new int[MAX_N * MAX_X];//칠해진 횟수
        int[] checkedCnt = new int[MAX_N * MAX_X];// 흰색, 검정 몇번 칠해졌는지
        
        int curr = MAX_N * MAX_X / 2;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);

            if (direction == 'R') {
                for (int j = curr; j < curr + x; j++) {
                    if (checked[j] == 4 && checkedCnt[j] == 0)
                        continue;
                    checked[j]++;
                    checkedCnt[j]++;
                } 
                curr += x;
            } else {
                for (int j = curr - 1; j >= curr - x; j--) {
                    if (checked[j] == 4  && checkedCnt[j] == 0)
                        continue;
                    checked[j]++;
                    checkedCnt[j]--;
                }
                curr -= x;
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;
        for (int i = 0; i < MAX_N * MAX_X; i++) {
            if (checked[i] == 0)
                continue;
            if (checked[i] == 4 && checkedCnt[i] == 0)
                gray++;
            else if (checkedCnt[i] > 0)
                white++;
            else
                black++;
        }

        System.out.print(white + " " + black + " " + gray);
    }
}