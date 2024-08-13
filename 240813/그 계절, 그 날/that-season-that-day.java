import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt(); // 연도
        int M = sc.nextInt(); // 월
        int D = sc.nextInt(); // 일

        if (isValid(Y, M, D)) {
            System.out.println(getSeason(M));
        } else {
            System.out.println(-1);
        }
        
    }

    public static boolean isYoonNyeon(int Y) {
        // 4의 배수가 아니면 윤년이 아니다.
        if (Y % 4 != 0)
            return false;
        
        // Y가 4의 배수라는 것이 보장된다.
        // Y가 100의 배수가 아니면 윤년이 아니다.
        if (Y % 100 != 0)
            return true;

        // Y가 100의 배수인것이 보장된다.
        // Y가 400의 배수이면 윤년이다.
        if (Y % 400 == 0)
            return true;

        return false;
    }

    public static boolean isValid(int Y, int M, int D) {
        if (M == 2) {
            if (isYoonNyeon(Y))
                return D == 29;
            return D == 28;
        } 

        if (M == 4 || M == 6 || M == 9 || M == 11) {
            return D == 30;
        }
        return D == 31;
    }

    public static String getSeason(int M) {
        if (3 <= M && M <= 5)
            return "Spring";
        if (6 <= M && M <= 8)
            return "Summer";
        if (9 <= M && M <= 11)
            return "Fall";
        return "Winter";
    }
}