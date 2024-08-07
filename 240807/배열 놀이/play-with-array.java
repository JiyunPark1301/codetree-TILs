import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //원소 개수
        int q = sc.nextInt(); //질의 개수

        int[] nArr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nArr[i] = sc.nextInt();
        }

        for (int i = 1; i <= q; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                int a = sc.nextInt();
                System.out.println(nArr[a]);
            } else if (x == 2) {
                int b = sc.nextInt();
                int idx = -1;
                for (int j = 1; j <= n; j++) {
                    if (nArr[j] == b) {
                        idx = j;
                        break;
                    }  
                }
                if (idx == -1)
                    System.out.println(0);
                else
                    System.out.println(idx);
            } else {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int j = s; j <= e; j++) {
                    System.out.print(nArr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}