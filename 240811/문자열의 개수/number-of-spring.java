import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int idx = 0;
        String[] arr = new String[200];
        while(true) {
            String str = sc.next();
            if (str.equals("0")) {
                break;
            }
            
            if (cnt % 2 == 0) {
                arr[idx++] = str;
            }

            cnt++;
        }

        System.out.println(cnt);
        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
        }
    }
}