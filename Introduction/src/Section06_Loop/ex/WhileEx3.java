package Section06_Loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 100, i = 1, sum = 0;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
