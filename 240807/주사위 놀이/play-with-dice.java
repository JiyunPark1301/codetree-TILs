import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[7];

        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            countArr[x]++;
        } 

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}