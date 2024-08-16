import java.util.*;

class Point {
    int x;
    int y;
    int num;

    public Point(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[i] = new Point(x, y, i + 1);
        }

        Arrays.sort(arr, (a, b) -> {
            int aDistance = getDistance(a);
            int bDistance = getDistance(b);

            if (aDistance == bDistance)
                return a.num - b.num;
            return aDistance - bDistance;
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].num);
        }
    }

    public static int makePositive(int val) {
        return val < 0 ? -val : val;
    }

    public static int getDistance(Point p) {
        return makePositive(p.x) + makePositive(p.y);
    }
}