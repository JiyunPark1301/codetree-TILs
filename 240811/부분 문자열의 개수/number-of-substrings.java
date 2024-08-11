import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int cnt = 0;
        for (int i = 0; i < A.length() - B.length() + 1; i++) {
            boolean isExist = true;
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i + j) != B.charAt(j)) {
                    isExist = false;
                    break;
                }
            }

            if (isExist) cnt++;
        }
        System.out.print(cnt);
    }
}