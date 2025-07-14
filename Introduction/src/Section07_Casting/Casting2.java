package Section07_Casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intvalue = 0;

        //intvalue = doubleValue; // 컴파일 오류 발생
        intvalue = (int) doubleValue;
        System.out.println(intvalue);
        System.out.println("doubleValue = " + doubleValue);


        int z = (int) 10.5;
        System.out.println(z);
    }
}
