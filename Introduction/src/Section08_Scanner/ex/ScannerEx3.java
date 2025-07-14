package Section08_Scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("음식의 이름을 입력해주세요 :");
        String foodName = input.nextLine();

        System.out.print("음식의 가격을 입력해주세요 :");
        int foodPrice = input.nextInt();

        System.out.print("음식의 수량을 입력해주세요 :");
        int foodQuantitiy = input.nextInt();

        int totalPrice = foodPrice * foodQuantitiy;

        System.out.println(foodName + " " + foodQuantitiy + "개를 주문하셨습니다. 총 가격은 " + totalPrice+"원 입니다.");
    }
}
