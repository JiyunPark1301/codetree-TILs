import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i], b = arr[j], c = arr[k];
                    int sum = 0;
                    boolean isSatisfied = true;
                    while(true) {
                        int valA = a % 10;
                        int valB = b % 10;
                        int valC = c % 10;
                        
                        if (valA + valB + valC > 9) {
                            isSatisfied = false;
                            break;
                        }

                        a /= 10;
                        b /= 10;
                        c /= 10;

                        if (a == 0 && b == 0 && c == 0)
                            break;
                    }

                    if (isSatisfied) {
                        sum += arr[i] + arr[j] + arr[k];
                        max = Math.max(sum, max);
                    }
                }
            }
        }

        System.out.println(max);
    }
}