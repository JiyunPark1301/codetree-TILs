import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String str = Integer.toString(a + b);

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                cnt++;
        }

        System.out.print(cnt);
    }
}