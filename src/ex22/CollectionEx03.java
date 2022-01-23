package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet 생성
        Set<Integer> lotto = new HashSet<>();

        while (true) {
            int n = r.nextInt(45) + 1; // 2 = 0부터 1까지 뭐든 출력해

            lotto.add(n);

            // HashSet 에 n값을 add해서 저장
            // HashSet 데이터 크기가 6이 되면 break
            if (lotto.size() == 6) {
                break;
            }

        }

        // HashSet 데이터 출력!!
        System.out.println(lotto);
    }
}
