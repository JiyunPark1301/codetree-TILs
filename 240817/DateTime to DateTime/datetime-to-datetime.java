import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = 11 + 11 * 60 + 24 * 60 * 11;
        int y = c + b * 60 + 24 * 60 * a;

        if (x > y)
            System.out.print(-1);
        else
            System.out.print(y - x);
    }
}