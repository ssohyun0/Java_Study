package Section09_Array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println( (i+1) + "번 학생의 성적을 입력하세요 : ");
            System.out.print("국어 점수 : ");
            scores[i][0] = scanner.nextInt();

            System.out.print("영어 점수 : ");
            scores[i][1] = scanner.nextInt();

            System.out.print("수학 점수 : ");
            scores[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / 3;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + average);
        }
    }
}
