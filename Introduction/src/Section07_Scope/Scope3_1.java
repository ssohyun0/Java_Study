package Section07_Scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10, temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
/* 임시 변수인 temp가 main() 코드 블록에 선언 => 문제점
* 1. 비효율적인 메모리 사용
* 2. 코드 복잡도 증가
* */