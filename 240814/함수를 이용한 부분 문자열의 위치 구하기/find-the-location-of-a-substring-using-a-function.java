import java.util.Scanner;

public class Main {
    public static String str1;
    public static String str2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str1 = sc.next();
        str2 = sc.next();

        System.out.println(getIndex());
    }

    public static int getIndex() {
        return str1.indexOf(str2);
    }
}