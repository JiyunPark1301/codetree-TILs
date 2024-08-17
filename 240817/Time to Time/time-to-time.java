import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int x = 60 * a + b;
        int y = 60 * c + d;

        int elapsedTime = y - x;
        System.out.println(elapsedTime);
    }
}