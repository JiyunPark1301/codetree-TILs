public class Main {
    public static void main(String[] args) {
       int a = 1, b = 2, c = 3;

       //c의 값을 b에 복사하고, b의 값을 a에 복사한다.
       a = b = c;  // 3;

       System.out.println(a + " " + b + " " + c);
    }
}