package coffeemaker;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        // 커피 생성
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}
