import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int sub1;
    int sub2;
    int sub3;

    public Student(String name, int sub1, int sub2, int sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public int compareTo(Student s) {
        return (this.sub1 + this.sub2 + this.sub3) - (s.sub1 + s.sub2 + s.sub3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int sub3 = sc.nextInt();

            arr[i] = new Student(name, sub1, sub2, sub3);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].sub1 + " " + arr[i].sub2 + " " + arr[i].sub3); 
        }
    }
}