import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] - '0';
        }

        int num = 0;
        for (int i = 0; i < newArr.length; i++) {
            num = num * 2 + newArr[i];
        } 

        System.out.println(num);
    }
}