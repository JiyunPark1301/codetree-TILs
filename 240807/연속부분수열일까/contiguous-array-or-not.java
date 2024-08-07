import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] n1Arr = new int[n1];
        int[] n2Arr = new int[n2];
        int[] idxArr = new int[100];

        for (int i = 0; i < n1; i++) {
            n1Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            n2Arr[i] = sc.nextInt();
        }

        boolean isPart = false;
        for (int i = 0; i <= n1 - n2; i++) {
            if (n1Arr[i] == n2Arr[0]) {
                boolean isSame = true;
                for (int j = 0; j < n2; j++) {
                    if (n1Arr[j + i] != n2Arr[j]) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    isPart = true;
                    break;
                }
            }
        }


        if (isPart)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}