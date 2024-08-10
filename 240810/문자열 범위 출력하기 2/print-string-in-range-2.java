import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int startIdx = str.length() - 1;
        int lastIdx = startIdx - n + 1;
        if (lastIdx < 0) {
            lastIdx = 0;
        }
        for (int i = startIdx; i >= lastIdx; i--) {
            System.out.print(str.charAt(i));
        }
    }
}