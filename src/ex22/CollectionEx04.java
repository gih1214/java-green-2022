package ex22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CollectionEx04 {
    public static void main(String[] args) {
        // 1) 6개의 로또 번호를 정한다. - ArrayList 담기
        // 당첨번호 : 3, 5, 30, 40, 41, 42
        ArrayList<Integer> datas = new ArrayList<>();
        datas.add(3);
        datas.add(5);
        datas.add(30);
        datas.add(40);
        datas.add(41);
        datas.add(42);
        // System.out.println(datas);

        // 2) Scanner로 금액을 입력 받는다. ex) 5000원 -> 5회
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        Set<Integer> lotto = new HashSet<>();

        Random r = new Random();

        if (price == 5000) {

            while (true) {

                int n = r.nextInt(45) + 1;

                lotto.add(n);

                if (lotto.size() == 6) {
                    break;
                }

            }

        }

        System.out.println(lotto);

        // 3) 입력 받은 금액에 따라 5000원이면 ArrayList에 담기
        // HashSet<Integer> 를 담기

        // 4) 1번과 2번을 비교해서 당첨됐는지 확인해서 출력하기

    }
}
