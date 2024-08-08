import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        int min = 1001;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 500 && max < arr[i])
                max = arr[i];
            else if (arr[i] > 500 && min > arr[i])
                min = arr[i];
        }

        System.out.print(max + " " + min);
    }
}