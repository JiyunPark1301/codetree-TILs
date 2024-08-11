import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String res1 = "";
        for (int i = 0; i < str1.length(); i++) {
            char x = str1.charAt(i);
            if (x < '0' || x > '9') {
                break;
            }
            res1 += x;
        }

        String res2 = "";
        for (int i = 0; i < str2.length(); i++) {
            char x = str2.charAt(i);
            if (x < '0' || x > '9') {
                break;
            }
            res2 += x;
        }

        System.out.print(Integer.parseInt(res1) + Integer.parseInt(res2));
    }
}