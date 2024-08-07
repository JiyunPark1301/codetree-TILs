import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 2)
                count++;
            
            if (count == 3) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}