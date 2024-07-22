import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);

        if (x == 'S') System.out.println("Superior");
        else if (x == 'A') System.out.println("Excellent");
        else if (x == 'B') System.out.println("Good");
        else if (x == 'C') System.out.println("Usually");
        else if (x == 'D') System.out.println("Effort");
        else System.out.println("Failure");
    }
}