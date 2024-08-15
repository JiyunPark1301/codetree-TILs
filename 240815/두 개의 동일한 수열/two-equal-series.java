import java.util.*;

public class Main {
    public static int n;
    public static int[] arrA = new int[100];
    public static int[] arrB = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA, 0, n);
        Arrays.sort(arrB, 0, n);

        if (isSame())
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isSame() {
        for (int i = 0; i < n; i++) {
            if (arrA[i] != arrB[i]) {
                return false;
            }
        }
        return true;
    }
}