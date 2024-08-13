import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);

        getResult(aWrapper, bWrapper);

        a = aWrapper.value;
        b = bWrapper.value;

        System.out.print(a + " " + b);
    }

    public static void getResult(IntWrapper aWrapper, IntWrapper bWrapper) {
        if (aWrapper.value <= bWrapper.value) {
            bWrapper.value += 25;
            aWrapper.value *= 2;
        } else {
            aWrapper.value += 25;
            bWrapper.value *= 2;
        }
    }
}