import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char aIsSick = sc.next().charAt(0);
        int aTemp = sc.nextInt();
        char bIsSick = sc.next().charAt(0);
        int bTemp = sc.nextInt();
        char cIsSick = sc.next().charAt(0);
        int cTemp = sc.nextInt();

        int count = 0;
        count = checkValue(aIsSick, aTemp, count);
        count = checkValue(bIsSick, bTemp, count);
        count = checkValue(cIsSick, cTemp, count);

        if (count >= 2) {
            System.out.println('E');
        } else {
            System.out.println('N');
        }
    }

    private static int checkValue(char isSick, int temp, int count) {
        if (isSick == 'Y' && temp >= 37) {
            count++;
        } 
        return count; 
    }
}