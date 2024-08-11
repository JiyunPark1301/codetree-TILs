import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isMagicNumber(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isMagicNumber(int i) {
        return i % 3 == 0 || contain369(i);
    }

    public static boolean contain369(int i) {
        while (i > 0) {
            int r = i % 10;
            if (r == 3 || r == 6 || r == 9)
                return true;
            
            i /= 10;
        }
        return false;
    }
}