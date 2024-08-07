import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[11];
        for (int i = 1; i <= 100; i++) {
            int x = sc.nextInt();

            if (x == 0)
                break;
            
            countArr[x / 10]++;
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " + countArr[i]);
        }
    }
}