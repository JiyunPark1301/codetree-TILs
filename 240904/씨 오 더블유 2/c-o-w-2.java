import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        int cnt = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(i) == 'C' && str.charAt(j) == 'O' && str.charAt(k) == 'W')
                        cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}