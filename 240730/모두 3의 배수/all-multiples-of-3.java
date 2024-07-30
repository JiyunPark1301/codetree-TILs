import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isSatisfied = true;
        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();

            if (n % 3 != 0)
                isSatisfied = false;
        }

        if (isSatisfied)
            System.out.println(1);
        else
            System.out.println(0);
    }
}