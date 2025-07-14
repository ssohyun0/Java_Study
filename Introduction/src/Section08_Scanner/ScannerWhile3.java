package Section08_Scanner;

import java.util.Scanner;
public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하세요 :");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                sum += num;
            }
        }
        System.out.println("모든 정수의 합 : " + sum);
    }
}
