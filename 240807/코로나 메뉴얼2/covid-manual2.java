import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[4];
        for (int i = 1; i <= 3; i++) {
            char c = sc.next().charAt(0);
            int x = sc.nextInt();

            if (c == 'Y') {
                if (x >= 37)
                    countArr[0]++;
                else
                    countArr[2]++;
            } else {
                if (x >= 37)
                    countArr[1]++;
                else
                    countArr[3]++;
            }
        }

        for (int i = 0; i <= 3; i++) {
            System.out.print(countArr[i] + " ");
        }

        if (countArr[0] >= 2)
            System.out.print('E'); 
    }
}