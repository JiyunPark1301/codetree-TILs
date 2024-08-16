import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] arr = new String[n];

        // 배열 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // 문자열 배열에서 t로 시작하는 문자열을 담기 위한 배열
        String[] newArr = new String[n];

        int idx = 0;
        for (int i = 0; i < n ; i++) {
            if (arr[i].startsWith(t)) {
                newArr[idx++] = arr[i];
            }
        }
        
        // 사전순으로 정렬
        Arrays.sort(newArr, 0, idx);

        // k번째 문자열 출력
        System.out.print(newArr[k - 1]);
    }
}