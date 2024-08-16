import java.util.*;

class Weather {
    String date;
    String yoil;
    String w;

    public Weather(String date, String yoil, String w) {
        this.date = date;
        this.yoil = yoil;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Weather[] arr = new Weather[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String yoil = sc.next();
            String w = sc.next();

            arr[i] = new Weather(date, yoil, w);
        }

        int lastIdx = 0;
        boolean isInitialized = false;
        for (int i = 0; i < n; i++) {
            if (!"Rain".equals(arr[i].w))
                continue;

            if (isInitialized) {
                if (arr[i].date.compareTo(arr[lastIdx].date) < 0) 
                lastIdx = i;
            } else {
                isInitialized = true;
                lastIdx = i;
            }
        }

        System.out.print(arr[lastIdx].date + " " + arr[lastIdx].yoil + " " + arr[lastIdx].w);
    }
}