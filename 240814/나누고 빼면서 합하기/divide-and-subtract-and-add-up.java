import java.util.Scanner;

public class Main {
    public static int n; //원소의 개수
    public static int m;
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); 
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getNumber());
    }

    public static int getNumber() {
        int sum = 0;
        while(m >= 1) {
            sum += arr[m - 1];
            if (m % 2 == 1)
                m -= 1;
            else
                m /= 2;
        }

        return sum;
    }
}