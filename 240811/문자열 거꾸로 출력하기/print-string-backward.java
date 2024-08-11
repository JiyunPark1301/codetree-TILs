import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String str = sc.next();
            if (str.equals("END"))
                break;
            
            char[] arr = str.toCharArray();
            for (int j = 0; j < str.length() / 2; j++) {
                char temp = arr[j];
                arr[j] = arr[str.length() - 1 - j];
                arr[str.length() - 1 - j] = temp;
            }

            System.out.println(String.valueOf(arr));
        }
    }
}