import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;
        int sumVal = 0;
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x % 2 == 1 && x % 3 == 0) {
                sumVal += x;
            }
        }
        System.out.println(sumVal);
    }
}