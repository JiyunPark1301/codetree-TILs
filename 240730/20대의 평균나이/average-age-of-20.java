import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cnt = 0, sum = 0;
        while (true) {
            n = sc.nextInt();

            if (n / 10 != 2)
                break;
            
            cnt++;
            sum += n;
        }

        System.out.printf("%.2f", (double)sum/cnt);
    }
}