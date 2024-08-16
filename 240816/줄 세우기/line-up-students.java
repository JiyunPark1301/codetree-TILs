import java.util.*;

class Student {
    int height;
    int weight;
    int number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
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
            int number = i + 1;

            arr[i] = new Student(height, weight, number);
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.height != b.height)
                return b.height - a.height;
            
            if (a.weight != b.weight)
                return b.weight - a.weight;
            
            return a.number - b.number;
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].height + " " + arr[i].weight + " " + arr[i].number);
        }
    }
}