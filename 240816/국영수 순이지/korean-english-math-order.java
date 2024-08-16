import java.util.*;

class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            arr[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.kor == b.kor) {
                    if (a.eng == b.eng) {
                        return b.math - a.math;
                    }
                    return b.eng - a.eng;
                }
                return b.kor - a.kor;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].kor + " " + arr[i].eng + " " + arr[i].math); 
        }
    }
}