import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        System.out.println(isYoonNyeon(y));
    }

    public static boolean isYoonNyeon(int y) {
        // 4로 나누어 떨어지면 윤년
        if (y % 4 == 0) {
            if (y % 100 == 0 && y % 400 != 0)
                return false;
            return true;
        } 
        // 4로 나누어 떨어지지 않으면 평년
        return false;
    }
}