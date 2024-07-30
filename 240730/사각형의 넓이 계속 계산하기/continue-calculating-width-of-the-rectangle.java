import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w, h;
        char n;
        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            n = sc.next().charAt(0);

            System.out.println(w * h);

            if (n == 'C')
                break;
        }
    }
}