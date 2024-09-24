import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            //명령어 입력
            String str = sc.next();

            if ("push_back".equals(str)) {
                int A = sc.nextInt();
                arr.add(A);
            } else if ("get".equals(str)) {
                int k = sc.nextInt();
                System.out.println(arr.get(k - 1));
            } else if ("size".equals(str)) {
                System.out.println(arr.size());
            } else {
                arr.remove(arr.size() - 1);
            }
        }
    }
}