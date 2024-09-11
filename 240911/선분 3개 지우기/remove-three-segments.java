import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] counting = new int[101];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            for (int j = x1[i]; j <= x2[i]; j++) {
                counting[j]++;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    boolean isOverlap = false;
                    int[] tmp = new int[101];
                    for (int r = 0; r < 101; r++) {
                        tmp[r] = counting[r];
                    }
                    //제외한 선분인 경우 tmp배열에서 값을 하나 빼준다.
                    for (int r = x1[i]; r <= x2[i]; r++) {
                        tmp[r]--;
                    }
                    for (int r = x1[j]; r <= x2[j]; r++) {
                        tmp[r]--;
                    }
                    for (int r = x1[k]; r <= x2[k]; r++) {
                        tmp[r]--;
                    }
                  
                    for (int r = 0; r < n; r++) {
                        //3개의 선분 제외시키기
                        if (r == i || r == j || r == k)
                            continue;
                            
                        for (int l = x1[r]; l <= x2[r]; l++) {
                            if (tmp[l] > 1) {
                                isOverlap = true;
                                break;
                            }
                        }

                        if (isOverlap)
                            break;
                    }

                    if (!isOverlap)
                        cnt++;
                }
            }
        }
        
        System.out.println(cnt);
    }
}