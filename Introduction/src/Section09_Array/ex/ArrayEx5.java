package Section09_Array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = input.nextInt();

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / count;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);

    }
}
