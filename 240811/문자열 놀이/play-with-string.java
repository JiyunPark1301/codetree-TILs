import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                s = s.substring(0,a - 1) + s.charAt(b - 1) + s.substring(a, b - 1) + s.charAt(a - 1) + s.substring(b);
                System.out.println(s);
            } 
            
            if (x == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                s = s.replace(a, b);
                System.out.println(s);
            }
        }
    }
}