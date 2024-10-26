import java.util.*;

public class Main {
    static String str;
    static int[] alphabet = new int[6];
    static int answer = Integer.MIN_VALUE;

    public static int calculate(char c, int x, int y) {
        if (c == '+')
            return x + y;
        if (c == '-')
            return x - y;
        
        return x * y;
    }

    public static void dfs(int idx) {
        if (idx == str.length() + 1) {
            int val = 0;
            char op = ' ';
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                //알파벳인 경우
                if ('a' <= c && c <= 'z') {
                    if (op == ' ') {
                        val = alphabet[c - 'a'];
                    } else {
                        val = calculate(op, val, alphabet[c - 'a']);
                    }
                } else {
                    op = c;
                }
            }

            answer = Math.max(answer, val);
            return;
        }

        for (int i = 1; i <= 4; i++) {
            alphabet[str.charAt(idx) - 'a'] = i;
            dfs(idx + 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        
        dfs(0);

        System.out.println(answer);
    }
}