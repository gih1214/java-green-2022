package coffeemaker;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // 0. 이 세상에 태어나야 함.
        Customer customer = new Customer();
        Barista barista = new Barista();

        MenuItem m1 = new MenuItem("아메리카노", 1500);
        MenuItem m2 = new MenuItem("카푸치노", 2000);
        MenuItem m3 = new MenuItem("카라멜 마끼아또", 2500);
        MenuItem m4 = new MenuItem("에스프레소", 1500);
        List<MenuItem> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Menu menu = new Menu(list);

        // 1. 커피 주문하기
        customer.order("아메리카노", menu, barista);
    }
}
