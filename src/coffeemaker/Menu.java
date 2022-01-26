package coffeemaker;

import java.util.List;

public class Menu {

    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    // 2번

    public MenuItem choose(String menuName) { // 원하는 커피를 골라서 리턴해주기
        for (MenuItem each : items) { // for(자료형 변수명 : 배열명){} : 원소 출력
            // if (each.getName().equals()) {
            // return each;
            // }
        }
        return null;
    }
}
