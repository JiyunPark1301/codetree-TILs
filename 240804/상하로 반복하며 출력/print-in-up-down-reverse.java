import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 1;
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) {
                    System.out.print(l);
                } else {
                    System.out.print(k);
                }
            }
            l++;
            k--;
            System.out.println();
        }
    }
}