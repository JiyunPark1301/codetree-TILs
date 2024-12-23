import java.util.*;

class MyInteger {
    int value;
    int idx;

    public MyInteger(int value, int idx) {
        this.value = value;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        MyInteger[] arr = new MyInteger[N];
        
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            arr[i] = new MyInteger(v, i);
        }
    
        // 값을 기준으로 오름차순 정렬
        // 값이 같은 경우는 index를 기준으로 오름차순 정렬(먼저 입력된 것)
        Arrays.sort(arr, (a, b) -> {
            if (a.value == b.value)
                return a.idx - b.idx;
            return a.value - b.value;
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[arr[i].idx] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}