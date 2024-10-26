import java.util.*;

public class Main {
    static final int MAX_N = 20;
    static final int BOMB_TYPE_NUM = 3;
    static int n; 
    
    static int[][] bombType = new int[MAX_N][MAX_N];
    static boolean[][] bombed = new boolean[MAX_N][MAX_N];
    static ArrayList<Pair> bombPos = new ArrayList<>();
    static int answer;

    static class Pair {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void bomb(int x, int y, int bType) {
        //폭탄 종류마다 터질 위치를 미리 정의합니다.
        Pair[][] bombShapes = {
            {},
            {new Pair(-2, 0), new Pair(-1, 0), new Pair(0, 0), new Pair(1, 0), new Pair(2, 0)}, //1
            {new Pair(-1, 0), new Pair(1, 0), new Pair(0, 0), new Pair(0, -1), new Pair(0, 1)}, //2
            {new Pair(-1, -1), new Pair(-1, 1), new Pair(0, 0), new Pair(1,-1), new Pair(1, 1)} //3
        };

        // 격자 내 칸에 대해서만 영역을 표시한다.
        for(int i = 0; i < 5; i++) {
            int nx = x + bombShapes[bType][i].x;
            int ny = y + bombShapes[bType][i].y;

            if (inRange(nx, ny)) {
                bombed[nx][ny] = true;
            }
        }
    }

    public static int calc() {
        //Step1. 폭탄이 터진 위치를 표시하는 배열을 초기화한다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bombed[i][j] = false;
            }
        }

        //Step2. 각 폭탄의 타입에 따라 초토화되는 영역을 표시한다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bombType[i][j] > 0)
                    bomb(i, j, bombType[i][j]);
            }
        }

        //Step3. 초토화되는 영역의 개수를 구한다.
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bombed[i][j])
                    cnt++;
            }
        }

        return cnt;
    }
 
    public static void dfs(int idx) {
        if (idx == bombPos.size() ) {
            answer = Math.max(answer, calc());
            return;
        }

        for (int i = 1; i <= 3; i++) {
            int x = bombPos.get(idx).x;
            int y = bombPos.get(idx).y;

            bombType[x][y] = i;
            dfs(idx + 1);
            bombType[x][y] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int bombPlace = sc.nextInt();
                if (bombPlace > 0)
                    bombPos.add(new Pair(i, j));
            }
        }

        dfs(0);
        System.out.println(answer);
    }
}