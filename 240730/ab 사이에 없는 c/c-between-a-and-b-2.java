import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isSatisfied = true;
        for (int i = a; i <= b; i++) {
            if (i % c == 0)
                isSatisfied = false;
        } 

        if (isSatisfied)
            System.out.println("YES");
        else
            System.out.println("NO");   
    }
}