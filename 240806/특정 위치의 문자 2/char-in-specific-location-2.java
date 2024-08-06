import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            char c = sc.next().charAt(0);
            if (i == 1 || i == 4 || i == 7) 
                System.out.print(c + " ");
        }
    }
}