import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;
        int b = n;

        System.out.print(a + " " + b + " ");

        int temp = 0;
        while (temp < 100) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }
    }
}