import java.util.*;

class Price {
    public int p;
    public int s;

    public Price(int p, int s) {
        this.p = p;
        this.s = s;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //학생수
        int B = sc.nextInt(); //예산

        Price[] arr = new Price[N];

        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            int s = sc.nextInt();
            arr[i] = new Price(p, s);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            Price[] tmp = new Price[N];
            for (int j = 0; j < N; j++) {
                int p, s;
                if (i == j) {
                    p = arr[j].p / 2;
                } else {
                    p = arr[j].p;
                }
                s = arr[j].s;
                tmp[j] = new Price(p, s); 
            }

            Arrays.sort(tmp, (a, b) -> (a.p + a.s) - (b.p + b.s));

            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                sum += tmp[j].p + tmp[j].s;
                if (sum > B)
                    break;

                cnt++;
            }

            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
} 

//2 + 2 = 4
//4 + 2 = 6