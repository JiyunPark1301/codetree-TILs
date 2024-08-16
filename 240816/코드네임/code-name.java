import java.util.*;

class NewClass {
    char codeName;
    int score;

    public NewClass(char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NewClass[] arr = new NewClass[5];

        for (int i = 0; i < 5; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();

            arr[i] = new NewClass(codeName, score);
        }

        int minIdx = 0;
        for (int i = 1; i < 5; i++) {
            if (arr[i].score < arr[minIdx].score)
                minIdx = i;
        }

        System.out.print(arr[minIdx].codeName + " " + arr[minIdx].score);
    }
}