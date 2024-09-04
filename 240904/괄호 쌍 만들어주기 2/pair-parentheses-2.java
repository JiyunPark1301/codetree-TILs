import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int cnt = 0;
        for (int i = 0; i < text.length() - 3; i++) {
            String str1 = text.substring(i, i + 2);
            if (!"((".equals(str1))
                continue;

            for (int j = i + 2; j < text.length() - 1; j++) {
                String str2 = text.substring(j, j + 2);
                if ("))".equals(str2))
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
} 

// )((()())())