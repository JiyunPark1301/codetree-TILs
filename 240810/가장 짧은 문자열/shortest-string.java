import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int min = len1;
        if (min > len2)
            min = len2;
        if (min > len3)
            min = len3;

        int max = len1;
        if (max < len2)
            max = len2;
        if (max < len3)
            max = len3;
        
        System.out.print(max - min);
    }
}