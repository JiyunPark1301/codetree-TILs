import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] countArr = new int[10];
        while (a > 1) {
            countArr[a % b]++;
            a = a / b;
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += countArr[i] * countArr[i];
        }

        System.out.println(sum);
    }
}