import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        String newStr1 = String.valueOf(arr1);
        String newStr2 = String.valueOf(arr2);

        if (newStr1.equals(newStr2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}