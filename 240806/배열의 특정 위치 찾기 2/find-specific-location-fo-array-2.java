import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (i % 2 == 0)
                sum1 += x;
            else
                sum2 += x;
        }

        if (sum1 >= sum2)
            System.out.println(sum1 - sum2);
        else
            System.out.println(sum2 - sum1);
    }
}