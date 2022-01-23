package ex22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

interface Hello {

}

interface Haha {

}

class Bye implements Hello, Haha {

}

public class CollectionEx01 {
    public static void main(String[] args) {
        // ArrayList는 데이터 중복 가능한 데이터 모임
        // 여러개의 데이터가 저장되는 제네릭 박스
        ArrayList<String> datas = new ArrayList<String>();
        datas.add("데이터1");
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");

        datas.set(1, "data2");
        datas.remove(3);

        System.out.println(datas.get(0));
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));

    }
}
