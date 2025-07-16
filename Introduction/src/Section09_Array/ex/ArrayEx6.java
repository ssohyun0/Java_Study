package Section09_Array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber = -2147483648, minNumber = 2147483647;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = input.nextInt();

        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);

    }
}
