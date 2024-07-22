import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //중간
        int b = sc.nextInt(); //기말

        if (a < 90) {
            System.out.println(0);
        } else if (b >= 95) {
            System.out.println(100000);
        } else if (b >= 90) {
            System.out.println(50000);
        } else {
            System.out.println(0);
        }
    }
}