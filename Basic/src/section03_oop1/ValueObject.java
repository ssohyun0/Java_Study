package section03_oop1;

public class ValueObject {
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
