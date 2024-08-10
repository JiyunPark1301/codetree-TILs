import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int x1 = arr[i].charAt(2);
            int x2 = arr[i].charAt(3);

            if (x1 == c || x2 == c) {
                System.out.println(arr[i]);
                cnt++;
            }
                
        }
        System.out.print(cnt);
    }
}