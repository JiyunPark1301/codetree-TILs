import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(); // 키
        int w = sc.nextInt(); // 몸무게
        int b = (10000 * w) / (h * h);

        System.out.println(b);
        if (b >= 25) {
            System.out.println("Obesity");
        }
    }
}