import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v;
        int r = a;
        if (a < b) {
            System.out.print("0.");

            // 3/7
            for (int i = 1; i <= 20; i++) {
                v = r * 10 / b; //3*10/7=4 //2*10/7=4
                r = r * 10 % b; //3*10/7=2 //2*10%7=6
                System.out.print(v + "");
            }
        } else {
            System.out.print("1.00000000000000000000");
        }
    }
}