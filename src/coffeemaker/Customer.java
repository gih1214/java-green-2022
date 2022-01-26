package coffeemaker;

public class Customer {
    // 1번
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName); // 1-1. 메뉴 고르기
        Coffee coffee = barista.makeCoffee(menuItem); // 1-2. 골라서 바리스타한테 주문
    }
}
