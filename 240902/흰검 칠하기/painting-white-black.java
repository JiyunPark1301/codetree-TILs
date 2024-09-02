import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] currColor = new int[1000 * 100 * 2 + 1]; //현재 색칠된 색
        int[] blackCnt = new int[1000 * 100 * 2 + 1];  //검은색이 색칠된 횟수
        int[] whiteCnt = new int[1000 * 100 * 2 + 1];  //하얀색이 색칠된 횟수

        int currPos = 1000 * 100; //현재위치
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'L') {
                for (int j = currPos; j >= currPos - x + 1; j--) {
                    whiteCnt[j]++;
                    if (whiteCnt[j] >= 2 && blackCnt[j] >= 2) { //검은색, 하얀색이 두번이상 칠해졌을 경우
                        currColor[j] = 3; //현재색: 회색
                        continue;
                    } 
                    currColor[j] = 1; //현재색: 하얀색
                }
                currPos = currPos - x + 1;
            } else {
               for (int j = currPos; j <= currPos + x - 1; j++) {
                    blackCnt[j]++;
                    if (whiteCnt[j] >= 2 && blackCnt[j] >= 2) { //검은색, 하얀색이 두번이상 칠해졌을 경우
                        currColor[j] = 3; //현재색: 회색
                        continue;
                    } 
                    currColor[j] = 2; //현재색: 검은색
                }
                currPos = currPos + x - 1;
            }
        }

        int black = 0;
        int white = 0;
        int gray = 0;
        for (int i = 0; i <= 1000 * 100 * 2; i++) {
            if (currColor[i] == 3) //회색
                gray++;
            else if (currColor[i] == 1) //하얀색
                white++;     
            else if (currColor[i] == 2) //검은색
                black++;
                
        }

        System.out.println(white + " " + black + " " + gray);
    }
}