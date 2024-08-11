import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean isExist1 = false;
        boolean isExist2 = false;
        for (int i = 0; i < str.length() - 1; i++) {
            String res = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1));
            if (res.equals("ee"))
                isExist1 = true;
            else if (res.equals("ab"))
                isExist2 = true;
        }

        if (isExist1)
            System.out.print("Yes ");
        else
            System.out.print("No ");

        if (isExist2)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}