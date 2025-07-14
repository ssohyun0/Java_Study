package Section07_Casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // (int) / (int) => int
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2; // (int) / (int) => int => 형 변환
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2; // (double) / (int) => double
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / (double) 2; // (double) / (double) => double
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}
