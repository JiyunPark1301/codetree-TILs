import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String direction = sc.next();

        for (int i = 0; i < direction.length(); i++) {
            char c = direction.charAt(i);
            if (c == 'L') {
                str = str.substring(1) + str.substring(0, 1);
            } else if (c == 'R') {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            }
        }

        System.out.println(str);
    }
}