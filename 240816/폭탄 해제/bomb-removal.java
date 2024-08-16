import java.util.*;

class Bomb {
    String code;
    char color;
    int second;

    public Bomb(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();

        Bomb x = new Bomb(code, color, second);

        System.out.println("code : " + x.code);
        System.out.println("color : " + x.color);
        System.out.println("second : " + x.second);
    }
}