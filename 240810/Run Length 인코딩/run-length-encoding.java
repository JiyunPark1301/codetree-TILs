import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
       
        // 변환
        String encoded = "";

        // 입력의 첫번째 값을 읽고 초기화합니다.
        char currChar = str.charAt(0);
        int numChar = 1;
        for (int i = 1; i < str.length(); i++) {
            if (currChar == str.charAt(i)) {
                numChar++;
            } else {
                encoded += currChar + String.valueOf(numChar);
                numChar = 1;
                currChar = str.charAt(i);
            }
        }

        encoded += currChar + String.valueOf(numChar);

        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}