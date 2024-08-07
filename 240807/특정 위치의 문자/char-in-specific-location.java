import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};
        char c = sc.next().charAt(0);

        int idx = -1;
        for (int i = 0; i < 6; i++) {
            if (arr[i] == c) {
                idx = i;
                break;
            }
        }

        if (idx == -1)
            System.out.println("None");
        else
            System.out.println(idx);
    }
}