package ex10;

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        // 사용자로부터 5명의 성적을 입력받아서 평균을 구하는 프로그램
        // 배열 사용하기!!
        final int STUDENTS = 5; // final은 상수(변경 불가능)
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[STUDENTS];
        for (int i = 0; i < STUDENTS; i++) {
            System.out.print("성적을 입력하시오 :");
            scores[i] = scan.nextInt();
        }
        for (int i = 0; i < STUDENTS; i++) {
            total += scores[i];
        }
        System.out.println("평균 성적은" + total / STUDENTS + "입니다");
    }
}
