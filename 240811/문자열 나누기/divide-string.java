import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += sc.next();
        }

        int cnt = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
           cnt++;
           result += str.charAt(i);
           if (cnt == 5) {
                System.out.println(result);
                cnt = 0;
                result = "";
           }
        }

        if (cnt < 5)
            System.out.println(result);
    }
}