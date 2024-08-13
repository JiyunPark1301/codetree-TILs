import java.util.Scanner;

public class Main {
    public static int[] dayArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int M;
    public static int D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        D = sc.nextInt();

        if (isValid())
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isValid() {
        if (1 <= D && D <= dayArr[M - 1] )
            return true;
        return false;
    }
}