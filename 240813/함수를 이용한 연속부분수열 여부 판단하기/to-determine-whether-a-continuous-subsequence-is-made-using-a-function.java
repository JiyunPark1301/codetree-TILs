import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(); // 수열A의 원소 개수
        int n2 = sc.nextInt(); // 수열B의 원소 개수
        
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (isSubsequence(n1, n2, arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSubsequence(int n1, int n2, int[] arr1, int[] arr2) {
        for (int i = 0; i < n1 - n2 + 1; i++) {
            boolean isSame = true;
            for (int j = 0; j < n2; j++) {
                if (arr1[i + j] != arr2[j]) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                return true;
            }
        }

        return false;
    }
}