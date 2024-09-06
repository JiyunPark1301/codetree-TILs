import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //사람 수
        int[] arr = new int[101];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            arr[x] = (c == 'G') ? 1 : 2;
        }

        int max = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = i; j < 101; j++) {
                if (arr[i] == 0 || arr[j] == 0)
                    continue;

                int cnt1 = 0; //G의 개수
                int cnt2 = 0; //H의 개수
                int size = 0; //사진 크기
                for (int k = i; k <= j; k++) {
                    if (arr[k] == 1)
                        cnt1++;
                    else if (arr[k] == 2)
                        cnt2++;
                }

                if (cnt1 != 0 && cnt2 != 0 && cnt1 != cnt2) 
                    continue;

                size = j - i;
                max = Math.max(max, size);
            }
        }

        System.out.println(max);
    }
}