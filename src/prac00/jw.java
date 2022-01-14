package prac00;

class 동물 {
    String animal_name() {
        return "";
    }

    int animal_hp() {
        return 0;
    }

    int animal_attack() {
        return 0;
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String animal_name() {
        return this.name;
    }

    int animal_hp() {
        return this.hp;
    }

    int animal_attack() {
        return this.attack;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String animal_name() {
        return this.name;
    }

    int animal_hp() {
        return this.hp;
    }

    int animal_attack() {
        return this.attack;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String animal_name() {
        return this.name;
    }

    int animal_hp() {
        return this.hp;
    }

    int animal_attack() {
        return this.attack;
    }
}

public class jw {

    // 오버라이딩 = 무효화 하다 -> 아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(동물 u1, 동물 u2) {

        int attacked_hp;

        System.out.println(u2.animal_name() + "(이)가 공격당하고 있습니다.");
        attacked_hp = u2.animal_hp() - u1.animal_attack();
        System.out.println(u2.animal_name() + "의 hp : " + attacked_hp);
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        attack(lion, tiger);
        attack(lion, bear);
        attack(tiger, lion);
        attack(tiger, bear);
        attack(bear, lion);
        attack(bear, tiger);
    }
}