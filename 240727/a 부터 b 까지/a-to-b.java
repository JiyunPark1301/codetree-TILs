import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = a;

        while (v <= b) {
            System.out.print(v + " ");
            if (v % 2 == 1)
                v *= 2;
            else
                v += 3;
        }
    }
}