import java.util.*;

class NewClass {
    String id;
    int level;

    public NewClass() {
        id = "codetree";
        level = 10;
    }

    public NewClass(String id, int level) {
        this.id = id;
        this.level = level;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        NewClass x1 = new NewClass();
        NewClass x2 = new NewClass(id, level);

        printInfo(x1);
        printInfo(x2);
    }

    public static void printInfo(NewClass x) {
        System.out.println("user " + x.id + " lv " + x.level);
    }
}