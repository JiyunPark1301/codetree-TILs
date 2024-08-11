import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        while(true) {
            // 문자열A에서 문자열B를 찾는다.
            int idx = str1.indexOf(str2);
            
            // 문자열B를 찾지 못하면 빠져나간다.
            if (idx == -1)
                break;
            
            // 문자열B를 찾았다면 문자열B를 제거해준다.
            str1 = str1.substring(0, idx) + str1.substring(idx + str2.length());
           
        }

        System.out.println(str1);
    }
}