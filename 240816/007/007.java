import java.util.*;

class NewClass {
    String secretCode;
    char meetingPoint;
    int time;

    public NewClass(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secretCode = sc.next();
        char meetingPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        NewClass x = new NewClass(secretCode, meetingPoint, time);
        System.out.println("secret code : " + x.secretCode);
        System.out.println("meeting point : " + x.meetingPoint);
        System.out.println("time : " + x.time);
    }
}