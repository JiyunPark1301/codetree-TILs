import java.util.*;

class Student {
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Student[] arr = new Student[N];

        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            arr[i] = new Student(height, weight, i + 1);
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.height != b.height)
                return a.height - b.height;
            return b.weight - a.weight;
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].height + " " + arr[i].weight + " " + arr[i].num);
        }
    }
}