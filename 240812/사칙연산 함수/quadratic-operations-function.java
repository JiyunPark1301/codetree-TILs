import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if (isNotOperator(o))
            System.out.println("False");
        else
            System.out.println(a + " " + o + " " + c + " = " + getValue(a, o, c));
    }

    public static boolean isNotOperator(char o) {
        if (o != '+' && o != '-' && o != '*' && o != '/')
            return true;
        return false;
    }

    public static int getValue(int a, char o, int c) {
        if (o == '+')
            return a + c;
        if (o == '-')
            return a - c;
        if (o == '*')
            return a * c;
       
        // 나누기 연산이라는 것이 보장됨
        return a / c;
    }
}