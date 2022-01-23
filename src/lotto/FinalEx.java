package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class FinalEx {
    public static void main(String[] args) {
        /**
         * 1. ArrayList에 숫자 6개 담기
         * 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
         * 3. HashSet으로 랜덤함 로또 번호 6개 받기
         * 4. HashSet은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요!! (구글링)
         * 5. 로또 세트(HashSet) 5개를 ArrayList에 담기
         * 6. ArrayList 로또 2개 만들어서 비교해보기
         */

        System.out.println("금액을 입력하세요. (1회 : 1000원)");

        // 1. ArrayList에 숫자 6개 담기
        List<Integer> lotto = Arrays.asList(3, 5, 30, 40, 41, 42);

        // 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int count = (int) money / 1000; // 신창원기법

        System.out.println("받은 금액 : " + money);
        System.out.println("로또 횟수 : " + count);

        // 3. HashSet으로 랜덤함 로또 번호 6개 받기 + 로또 횟수만큼
        Random r = new Random();

        // 5. HashSet을 ArrayList에 담기
        List<List<Integer>> buyLottoList = new ArrayList<>();

        // for문으로 로또 횟수만큼 번호 뽑기
        for (int i = 0; i < count; i++) {
            // 횟수만큼 나오게 하려면 돌아갈 때마다 new 해줘야 함!
            Set<Integer> buyLotto = new HashSet<>();

            // while문으로 반복해서 lotto에 담기 (6개 번호)
            while (true) {
                int n = r.nextInt(45) + 1;
                buyLotto.add(n);

                // 한줄 코드는 중괄호 생략 가능 (if 에서만!!)
                if (buyLotto.size() == 6)
                    break;
            } // end of while

            // 일단 다섯번이 나온다.
            // System.out.println(buyLotto);

            // 이제 4. HashSet은 순차 정렬이 필요!!
            List<Integer> sl = new ArrayList<>(buyLotto);
            Collections.sort(sl);
            // 4번 순차 정렬이 됐는지 확인
            // System.out.println(sl);

            // 5. ArrayList 에 로또 번호 담기 확인
            buyLottoList.add(sl);

        } // end of for

        // 5번 출력은 잘 되는데 보기 불편하니까 for문으로 가독성을 높이자!
        // System.out.println(buyLottoList);
        for (int i = 0; i < buyLottoList.size(); i++) {
            System.out.println(buyLottoList.get(i));
        }

        // 6. 당첨번호와 비교해보기
        // int failCheck = 0;
        // final int LOTTOCYCLE = lotto.size(); // final이 붙은 변수는 대문자로 정의한다.

        // for (int i = 0; i < LOTTOCYCLE; i++) {
        // if (lotto.get(i) == buyLottoList.get(i)) {
        // System.out.println((i+1) + "로또 당첨");
        // } else {
        // failCheck++;
        // System.out.println("꽝");
        // }
    } // end of 6번!

} // end of main
