import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (i == 2 || i == 4 || i == 9)
                sum += x;
        }
        System.out.println(sum);
    }
}