package coffeemaker;

import lombok.Data;

@Data
public class MenuItem {
    // 아메리카노, 카푸치노, 카라멜 마끼아또, 에스프레소
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
