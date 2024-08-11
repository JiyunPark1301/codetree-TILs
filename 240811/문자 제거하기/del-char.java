import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while(true) {
            int n = sc.nextInt();
            if (n >= str.length()) {
                str = str.substring(0, str.length() - 1);
            } else {
                str = str.substring(0, n) + str.substring(n + 1);
            }
                
            System.out.println(str);

            if (str.length() == 1)
                break;
        }   
    }
}