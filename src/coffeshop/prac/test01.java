package coffeshop.prac;

import java.util.List;

// 객체의 타입을 구현하는 일반적인 방법은 클래스를 이용하는 것이다.

// 손님(customer)
class Customer {
    // 1. 손님이 메뉴를 보고 바리스타에게 주문을 한다.
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName); // 1-1. 메뉴 고르기
        Coffee coffee = barista.makeCoffee(menuItem); // 1-2. 골라서 바리스타한테 주문
    }
}

// 커피 종류
class MenuItem {
    private String name; // ?????
    private int price; // 엥???

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int cost() {
        return price;
    }

    public String getName() {
        return this.name;
    }

}

// 1-1. 메뉴판 - MenuItem에서 이름 가져올거다.
class Menu {
    private List<MenuItem> items; // MenuItem의 리스트

    public Menu(List<MenuItem> items) { // Menu의 생성자
        this.items = items;
    }

    // choose() 메서드는 목록을 하나씩 검사하면서 이름이 동일한 MenuItem을 찾아 반환해준다.
    public MenuItem choose(String name) { // 원하는 커피를 골라서 리턴해주기
        for (MenuItem each : items) { // for(자료형 변수명 : 배열명){} : 원소 출력
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }
}

// 바리스타
class Barista {
    // 1-2. 요청받은 커피 만들어서 손님한테 리턴
    public Coffee makeCoffee(MenuItem menuItem) { // 커피생성해서 손님에게 리턴해주기
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}

// 커피 : 커피를 new 하기 위해!
class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) { // 생성자 : 자기 자신을 생성하기 위해
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }
}

public class test01 {
    public static void main(String[] args) {
        Customer cus = new Customer();
        MenuItem item = new MenuItem("아이스 아메리카노", 1500);
        // Menu menu = new Menu();
        Barista barista = new Barista();
    }
}
