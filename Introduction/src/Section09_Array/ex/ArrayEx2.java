package Section09_Array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]);
            if (i != 4) {
                System.out.print(", ");
            }
        }
    }
}
