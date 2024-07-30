import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isSatisfied = true;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                isSatisfied = false;
        }

        if (isSatisfied)
            System.out.println('C');
        else
            System.out.println('P');
    }
}