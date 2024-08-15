import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        boolean isSame = true;
        for (int i = 0; i < n; i++) {
            if (arrA[i] != arrB[i]) {
                isSame = false;
                break;
            }
        }

        if (isSame)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}