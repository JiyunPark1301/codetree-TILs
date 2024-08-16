import java.util.*;

class Person {
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] arr = new Person[n];
        String[] nameArr = new String[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();

            arr[i] = new Person(name, addr, city);
            nameArr[i] = name;
        }

        // 이름 사전순으로 정렬
        Arrays.sort(nameArr);

        for (int i = 0; i < n; i++) {
            if (nameArr[n - 1].equals(arr[i].name)) {
                printInfo(arr[i]);
                break;
            }
        }
    }

    public static void printInfo(Person p) {
        System.out.println("name " + p.name);
        System.out.println("addr " + p.addr);
        System.out.println("city " + p.city);
    }
}