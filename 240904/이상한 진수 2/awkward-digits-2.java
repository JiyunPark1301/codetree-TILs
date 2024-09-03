import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int[] arr = new int[1025];
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            c = (c == '0') ? '1' : '0';
            arr[i] = Integer.parseInt(a.substring(0, i) + c + a.substring(i + 1));
        }

        Arrays.sort(arr, 0, a.length()); //오름차순 정렬
        int max = arr[a.length() - 1]; //최댓값

        int result = 0;
        int idx = 0;
        while(true) {
            if (max == 0) 
                break;
            result += (max % 10) * Math.pow(2, idx++);
            max /= 10;
        }

        System.out.println(result);
    }
}