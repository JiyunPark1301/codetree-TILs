import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if (month >= 12 || month <= 2) {
            System.out.println("Winter");
        } else if (month >= 9) {
            System.out.println("Fall");
        } else if (month >= 6) {
            System.out.println("Summer");
        } else {
            System.out.println("Spring");
        }
    }
}