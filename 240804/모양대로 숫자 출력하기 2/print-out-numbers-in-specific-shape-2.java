import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(cnt + " ");
                if (cnt == 8) {
                    cnt = 2;
                } else {
                    cnt += 2;
                }
            }
            System.out.println();
        }
    }
}