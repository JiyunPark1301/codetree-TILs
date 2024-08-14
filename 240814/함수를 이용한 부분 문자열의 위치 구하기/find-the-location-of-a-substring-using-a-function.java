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
        for (int i = 0; i < str1.length() - str2.length() + 1; i++) {
            if (isSame(i))
                return i;
        }

        return -1;
    }

    public static boolean isSame(int i) {
        for (int j = 0; j < str2.length(); j++) {
            if (str1.charAt(i + j) != str2.charAt(j))
                return false;
        } 

        return true;
    }
}