import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //전체 학생 수
        int M = sc.nextInt(); //벌칙에 걸린 학생 번호 갯수
        int K = sc.nextInt(); //벌금을 받는 벌칙 최소 횟수
        
        int[] arr = new int[M]; // 벌칙에 걸린 학생 번호 리스트
        int[] students = new int[N + 1];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }

        int result = -1;
        for (int i = 0; i < M; i++) {
            students[arr[i]]++;

            if (students[arr[i]] == K) {
                result = arr[i];
                break;
            }
        }

        System.out.println(result);
    }
}