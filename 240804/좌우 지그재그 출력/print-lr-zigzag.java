import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1; 
        int l = n * 2;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                int m = k;
                for (int j = 1; j <= n; j++) {
                    System.out.print(k + " ");
                    k++;
                }
                k = m + 2 * n;
            } else {
                int m = l;
                for (int j = 1; j <= n; j++) {
                    System.out.print(l + " ");
                    l--;
                }
                l = 2 * m;
            }
            System.out.println();
        }
    }
}