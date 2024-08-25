import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 개발자 수
        int K = sc.nextInt(); // 전염 가능한 최대 악수 횟수
        int P = sc.nextInt(); // 처음 전염병이 걸린 개발자 번호
        int T = sc.nextInt(); // 악수 횟수

        int[] cntArr = new int[N + 1]; //감염가능 횟수
        int[] isSick = new int[N + 1]; //감염여부(0: 음성, 1: 양성)

        int[][] arr = new int[251][2];
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[t][0] = x;
            arr[t][1] = y;
        }

        isSick[P] = 1;

        for (int i = 1; i < N + 1; i++) {
            cntArr[i] = 2;
        }

        for (int i = 1; i < 251; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            
            if (x == 0 && y == 0)
                continue;
            
            if (isSick[x] == 1) {
                if (isSick[y] == 1) {
                    if (cntArr[x] >= 1) {
                        cntArr[x]--;
                    }  
                    if (cntArr[y] >= 1) {
                        cntArr[y]--;
                    } 
                } else {
                    if (cntArr[x] >= 1) {
                        cntArr[x]--;
                        isSick[y] = 1;
                    }  
                }
            } else {
                if (isSick[y] == 1) {
                    if (cntArr[y] >= 1) {
                        cntArr[y]--;
                        isSick[x] = 1;
                    }  
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(isSick[i]);
        }
    }
}