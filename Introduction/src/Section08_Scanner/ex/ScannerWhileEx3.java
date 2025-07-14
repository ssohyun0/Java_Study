package Section08_Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, cnt = 0;
        double average = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while(true){
            int num = input.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            cnt ++;
        }
        average = (double) sum / cnt;

        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);


    }
}
