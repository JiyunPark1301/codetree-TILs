import java.util.*;

class Product {
    String name;
    int code;

    public Product() {
        name = "";
        code = 0;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.name = "codetree";
        p1.code = 50;

        String name = sc.next();
        int code = sc.nextInt();
        Product p2 = new Product(name, code);

        printInfo(p1);
        printInfo(p2);
    }

    public static void printInfo(Product p) {
        System.out.println("product " + p.code + " is " + p.name);
    }
}