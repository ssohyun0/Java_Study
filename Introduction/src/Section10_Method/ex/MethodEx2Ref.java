package Section10_Method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world";
        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    public static void printMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
