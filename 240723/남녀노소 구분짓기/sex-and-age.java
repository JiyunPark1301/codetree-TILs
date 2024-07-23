import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt(); //0,1
        int age = sc.nextInt();

        if (g == 0) {
            if (age >= 19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (age >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}