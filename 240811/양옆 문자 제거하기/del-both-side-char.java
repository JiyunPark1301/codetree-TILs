import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(str.substring(0, 1) + str.substring(2, str.length() - 2) + str.substring(str.length() - 1));
    }
}