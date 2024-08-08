import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int val = sc.nextInt();
        int maxVal = val;
        int minVal = val;

        for (int i = 0; i < 100; i++) {
            int x = sc.nextInt();
            if (x == 999 || x == -999) {
                break;
            }

            if (maxVal < x)
                maxVal = x;
            
            if (minVal > x)
                minVal = x;
        }

        System.out.println(maxVal + " " + minVal);
    }
}