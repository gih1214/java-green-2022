package coffeemaker;

public class Barista {

    // 3번
    // 요청받은 커피 만들어서 손님한테 리턴
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

}
