import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String res1 = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (c >= '0' && c <= '9') {
                res1 += c;
            }
        }
        String res2 = "";
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (c >= '0' && c <= '9') {
                res2 += c;
            }
        }

        System.out.println(Integer.parseInt(res1) + Integer.parseInt(res2));
    }
}