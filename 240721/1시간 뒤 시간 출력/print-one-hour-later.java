import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":"); //1:59
        int h = sc.nextInt(); //1
        int m = sc.nextInt(); //59
        System.out.printf("%d:%d", h+1, m);
    }
}