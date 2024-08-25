import java.util.*;

class Shake {
    int time;
    int person1;
    int person2;

    public Shake(int time, int person1, int person2) {
        this.time = time;
        this.person1 = person1;
        this.person2 = person2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 개발자 수
        int K = sc.nextInt(); // 전염 가능한 최대 악수 횟수
        int P = sc.nextInt(); // 처음 전염병이 걸린 개발자 번호
        int T = sc.nextInt(); // 악수 횟수

        int[] cntArr = new int[N + 1]; //감염가능 횟수
        int[] isSick = new int[N + 1]; //감염여부(0: 음성, 1: 양성)

        Shake[] arr = new Shake[T];
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            arr[i] = new Shake(t, x, y);
        }

        // 시간으로 오름차순 정렬
        Arrays.sort(arr, (a, b) -> a.time - b.time);

        isSick[P] = 1;

        for (int i = 1; i < N + 1; i++) {
            cntArr[i] = K;
        }

        for (int i = 0; i < T; i++) {
            int x = arr[i].person1;
            int y = arr[i].person2;
            
            if (isSick[x] == 1) {
                if (isSick[y] == 1) {
                    if (cntArr[x] >= 1) {
                        cntArr[x]--;
                    }  
                    if (cntArr[y] >= 1) {
                        cntArr[y]--;
                    } 
                } else {
                    if (cntArr[x] >= 1) {
                        cntArr[x]--;
                        isSick[y] = 1;
                    }  
                }
            } else {
                if (isSick[y] == 1) {
                    if (cntArr[y] >= 1) {
                        cntArr[y]--;
                        isSick[x] = 1;
                    }  
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(isSick[i]);
        }
    }
}