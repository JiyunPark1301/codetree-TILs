import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cnt = 0;
        while (true) {
            n = sc.nextInt();

            if (n % 2 == 0) {
                n /= 2;
                System.out.println(n);
                cnt++;
            }   

             if (cnt >= 3)
                break;
        }
    }
}