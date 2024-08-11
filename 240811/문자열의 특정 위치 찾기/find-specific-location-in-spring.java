import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        int idx = str.indexOf(c);
        if (idx == -1)
            System.out.println("No");
        else
            System.out.print(idx);
    }
}