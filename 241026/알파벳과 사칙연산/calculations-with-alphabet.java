import java.util.*;

public class Main {
    static String str;
    static int[] alphabet = new int[6];
    static int answer = Integer.MIN_VALUE;

    public static int calculate(char c, int x, int y) {
        if (c == '+') return x + y;
        if (c == '-') return x - y;
        return x * y; // '*' 연산
    }

    public static void dfs(int idx) {
        if (idx == str.length()) { // 종료 조건
            int val = 0;
            char op = ' ';
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ('a' <= c && c <= 'f') {
                    if (op == ' ') {
                        val = alphabet[c - 'a'];
                    } else {
                        val = calculate(op, val, alphabet[c - 'a']);
                    }
                } else {
                    op = c; // 연산자 업데이트
                }
            }
            answer = Math.max(answer, val);
            return;
        }

        // 인덱스가 알파벳의 인덱스인 경우만 처리
        if ('a' <= str.charAt(idx) && str.charAt(idx) <= 'f') {
            for (int i = 1; i <= 4; i++) {
                alphabet[str.charAt(idx) - 'a'] = i;
                dfs(idx + 1); // 다음 인덱스로 진행
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        dfs(0);
        System.out.println(answer);
    }
}