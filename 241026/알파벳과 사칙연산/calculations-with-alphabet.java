import java.util.*;

public class Main {
    //주어진 문자열
    static String str;
    
    //알파벳에 해당하는 숫자를 담기 위한 배열
    //'a' ~ 'f'-> 0 ~ 5번 인덱스
    static int[] alphabet = new int[6];

    //결과값
    static int answer = Integer.MIN_VALUE;

    public static int calculate(char c, int x, int y) {
        if (c == '+')
            return x + y;
        if (c == '-')
            return x - y;
        
        return x * y;
    }

    public static void dfs(int idx) {
        if (idx > str.length()) {
            int val = 0;
            char op = ' ';
            //알파벳에 숫자를 대입 후 연산
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                //알파벳인 경우
                if ('a' <= c && c <= 'f') {
                    if (op == ' ') {
                        val = alphabet[c - 'a'];
                    } else {
                        val = calculate(op, val, alphabet[c - 'a']);
                    }
                } else {
                    //연산자인 경우
                    op = c;
                }
            }

            //연산결과의 최댓값을 구한다.
            answer = Math.max(answer, val);
            return;
        }

        //1~4까지의 숫자를 문자에 담는다.
        for (int i = 1; i <= 4; i++) {
            alphabet[str.charAt(idx) - 'a'] = i;

            //연산자는 건너뛰어야 하므로 현재 인덱스에 +2를 해준다.
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