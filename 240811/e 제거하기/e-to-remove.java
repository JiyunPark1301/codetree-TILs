import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int idx = str.indexOf('e');
        System.out.print(str.substring(0, idx) + str.substring(idx + 1));
    }
}