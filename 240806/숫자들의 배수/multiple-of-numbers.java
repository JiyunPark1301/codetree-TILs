import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int val = n;
        while (cnt < 2) {
            if (val % 5 == 0)
                cnt++;
            System.out.print(val + " ");
            val += n;
        }
    }
}