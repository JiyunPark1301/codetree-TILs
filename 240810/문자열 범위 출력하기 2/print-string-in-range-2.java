import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int lastIdx = str.length() - 1;
        for (int i = lastIdx; i > lastIdx - n; i--) {
            System.out.print(str.charAt(i));
        }
    }
}