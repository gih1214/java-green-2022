package prac01;

// 오버라이드
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

    int animal_changeHp() {
        return 0;
    }
}

class 사자 extends 동물 {
    String animal_name() {
        return "사자";
    }

    int animal_hp() {
        return 100;
    }

    int animal_attack() {
        return 10;
    }
}

class 호랑이 extends 동물 {
    String animal_name() {
        return "호랑이";
    }

    int animal_hp() {
        return 100;
    }

    int animal_attack() {
        return 15;
    }
}

class 곰 extends 동물 {
    String animal_name() {
        return "곰";
    }

    int animal_hp() {
        return 100;
    }

    int animal_attack() {
        return 50;
    }
}

public class Prac {

    // 오버라이딩 = 무효화하다 -> 아래로 타고 내려가는 기법
    // unit1 -> unit2 공격
    static void attack(동물 unit1, 동물 unit2) {
        int hp = unit2.animal_hp();
        System.out.println(unit2.animal_name() + "가 공격당하고 있습니다.");
        hp = unit2.animal_hp() - unit1.animal_attack();
        System.out.println(unit2.animal_name() + "의 hp : " + hp);
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