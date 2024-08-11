import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int n = 0;
        while(true) {
            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
            n++;
            if (A.equals(B))
                break;
        }

        System.out.println(n);
    }
}