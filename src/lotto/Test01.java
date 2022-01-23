package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력 받아서 횟수 정하기 ex) 5000 - 5회

        System.out.println("로또를 살 금액을 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong(); // 돈을 표현할 때는 long 사용
        int count = (int) money / 1000; // 형변환, 다운 캐스트

        System.out.println("받은 금액:" + money);
        System.out.println("로또 횟수:" + count);

        HashSet<Integer> lotto = new HashSet<>();

        // 반복해서 lotto에 담기(6개)
        // Set 자료구조는 중복되는 데이터가 들어가면 허용하지 않는다.
        // while (true) {
        // int n = r.nextInt(45) + 1;
        // lotto.add(n);

        // // 한 줄 코드는 중괄호 생략 가능(조건문에서만)
        // if (lotto.size() == 6)
        // break;
        // }

        // n을 5번 각자 다른 난수로 반복문 사용 어떻게 하지?

        // for (int i = 0; i < 5; i++) {
        // Random r = new Random();
        // int n = r.nextInt(45) + 1;
        // lotto.add(n);
        // }

        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            int n = r.nextInt(45) + 1;
            lotto.add(n);
        }

        // 6번 돌아가는 로또 시스템(HashSet)을 ArrayList에 담기
        List<Integer> sortedList = new ArrayList<>(lotto); // 정렬됨
        Collections.sort(sortedList);

        int failCeck = 0;
        for (int i = 0; i < sortedList.size(); i++) { // 살 로또 숫자
            System.out.println("산 로또 번호 : " + sortedList);
        }

        // List<Integer> lotto = ArraysList<>(lotto);
        ArrayList<Integer> lotto2 = new ArrayList<>(); // 당첨 숫자

        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(6);
        lotto2.add(7);
        lotto2.add(10);

        System.out.println("오늘의 당첨 번호는 : " + lotto2);

        final int LOTTOCYCLE = sortedList.size(); // final이 붙은 변수는 대문자로 적는다. 상수라는 뜻이다.

        for (int i = 0; i < LOTTOCYCLE; i++) { // 메소드를 넣으면 반복될 때마다 메소드 호출이 되기 때문에 상수로 지정해서 넣는 게 좋다. 동적으로 데이터 들어감.
            if (lotto2 == sortedList) { // 산 로또랑 당첨 번호 비교
                System.out.println(i + "번지 비교 성공");
            } else {
                System.out.println(failCeck++ + "번 실패");
            }
        }

        if (failCeck == 0) {
            System.out.println("로또 당첨!");
        } else {
            System.out.println("로또 꽝!");
        }
    }

}