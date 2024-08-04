import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 1;
        int k = n;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(l + " ");
                    l++;
                }
                k = l + 1;
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(k + " ");
                    k += 2;
                }
                l = k - 1;
            }
            System.out.println();
        }
    }
}