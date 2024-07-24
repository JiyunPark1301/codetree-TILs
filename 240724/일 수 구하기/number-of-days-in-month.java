import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 31일 : 1월, 3월, 5월, 7월, 8월, 10월, 12월
        // 30일 : 4월, 6월, 9월, 11월
        // 28일 : 2월

        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
            System.out.println(31);
        } else if (n == 2) {
            System.out.println(28);
        } else {
            System.out.println(30);
        }
    }
}