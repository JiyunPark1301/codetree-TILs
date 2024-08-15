import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sortedStr = String.valueOf(arr);
        System.out.print(sortedStr);
    }
}