import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);
        char next;
        if (x == 'z')
            next = 'a';
        else
            next = (char)(x + 1);
        System.out.print(next);
    }
}