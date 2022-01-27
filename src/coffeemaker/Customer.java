package coffeemaker;

public class Customer {
    // 주문하기 메서드
    public void order(String menuName, Menu menu, Barista barista) {
        // 메뉴항목 찾기
        MenuItem menuItem = menu.choose(menuName);
        if (menuItem == null) {
            System.out.println("찾은 메뉴가 없습니다.");
        }
        // 바리스타에게 커피생성 요청
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println("홍길동이 " + coffee.getName() + "를 받았습니다.");
        System.out.println("금액 : " + coffee.getPrice() + "원");

    }
}
