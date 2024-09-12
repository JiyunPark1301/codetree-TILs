import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int cnt = 0;
        for (int i = X; i <= Y; i++) {
            String str = String.valueOf(i);
            String reversedStr = new StringBuilder(str).reverse().toString();
            if (str.equals(reversedStr))
                cnt++;
        }

        System.out.println(cnt);
    }
}