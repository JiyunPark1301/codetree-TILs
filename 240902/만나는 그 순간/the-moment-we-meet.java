import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr1 = new int[1000 * 1000 + 1];
        int[] arr2 = new int[1000 * 1000 + 1];

        int currPos = 0;
        int time = 1;
        for (int i = 0; i < N; i++) {
            char dir = sc.next().charAt(0);
            int x = sc.nextInt();

            for (int j = time; j < time + x; j++) {
                if (dir == 'R') {    
                    arr1[j] = ++currPos;
                } else {
                    arr1[j] = --currPos;
                }
            }
            
            time = time + x;
        }

        currPos = 0;
        time = 1;
        for (int i = 0; i < M; i++) {
            char dir = sc.next().charAt(0);
            int x = sc.nextInt();

            for (int j = time; j < time + x; j++) {
                if (dir == 'R') {    
                    arr2[j] = ++currPos;
                } else {
                    arr2[j] = --currPos;
                }
            }
            
            time = time + x;
        }

        int result = 0;
        for (int i = 1; i < time; i++) {
            if (arr1[i] == arr2[i]) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}