import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static int[] arr1 = new int[MAX_N];
    public static int[] arr2 = new int[MAX_N];

    public static int n1;
    public static int n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt(); // 수열A의 원소 개수
        n2 = sc.nextInt(); // 수열B의 원소 개수
        

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (isSubsequence()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSubsequence() {
        for (int i = 0; i < n1 - n2 + 1; i++) {
            if (isSame(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSame(int i) {
        for (int j = 0; j < n2; j++) {
            if (arr1[i + j] != arr2[j]) {
                return false;
            }
        }

        return true;
    }
}