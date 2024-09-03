import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int max = Integer.MIN_VALUE; //최대값

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            c = (c == '0') ? '1' : '0';
            int val = Integer.parseInt(a.substring(0, i) + c + a.substring(i + 1));
            max = Math.max(val, max);
        }

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