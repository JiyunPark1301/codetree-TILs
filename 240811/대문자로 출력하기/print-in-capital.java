import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 'a' + 'A');
            } else if (c >= 'A' && c <= 'Z') {
                result += c;
            }
        }
        System.out.println(result);
    }
}