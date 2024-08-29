import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int cnt = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                char a = str.charAt(i);
                char b = str.charAt(j);

                if (a == '(' && b == ')')
                    cnt++;
            }
        }

        System.out.print(cnt);
    }
}