import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int yyyy = sc.nextInt(); //1994
        int mm = sc.nextInt(); // 5
        int dd = sc.nextInt(); //26

        System.out.println(mm + "-" + dd + "-" + yyyy);
    }
}