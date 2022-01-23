package lottoex01;

import java.util.HashSet;
import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        // 3. HashSet으로 랜덤함 로또 번호 6개 받기
        Random r = new Random();

        for (int i = 0; i < 5; i++) {

            // 횟수만큼 나오게 하려면 돌아갈 때마다 new 해줘야 함!
            HashSet<Integer> buyLotto = new HashSet<>();

            // 반복해서 lotto에 담기 (6개)
            // Set 자료구조는 중복되는 데이터가 들어가면 허용하지 않음.
            while (true) {
                int n = r.nextInt(45) + 1;
                buyLotto.add(n);

                // 한줄 코드는 중괄호 생략 가능 (if 에서만!!)
                if (buyLotto.size() == 6)
                    break;
            } // end of while

            // 횟수만큼 나오게 하기
            System.out.println(buyLotto);
        }

    } // end of main
}
