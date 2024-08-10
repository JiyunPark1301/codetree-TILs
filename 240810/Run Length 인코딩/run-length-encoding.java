import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] arr = new String[1000];
        int cnt = 1;
        String s = "";
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            s += str.charAt(i);

            if (i == str.length() - 1) {
                arr[idx++] = s;
                break;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                arr[idx++] = s;
                s = "";
            } 
                
        }

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                break;
            } 
            result += arr[i].charAt(0) + String.valueOf(arr[i].length());
        }
        System.out.println(result.length());
        System.out.println(result);
    }
}