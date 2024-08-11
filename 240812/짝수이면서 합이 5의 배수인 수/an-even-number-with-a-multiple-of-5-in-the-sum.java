import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isSatisfied(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSatisfied(int n) {
        int sum = 0;
        int val = n;
        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }
        
        return n % 2 == 0 && sum % 5 == 0;
    }
}