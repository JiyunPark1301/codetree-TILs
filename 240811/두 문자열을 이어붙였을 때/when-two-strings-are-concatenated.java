import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String result1 = str1 + str2;
        String result2 = str2 + str1;

        System.out.println(result1.equals(result2));
    }
}