package ex10;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        // for-each 루프 : for (자료형 변수 : 배열이름)
        // 반복이 진행되면서 변수에 배열 원소가 차례대로 대입된다.
        for (int value : numbers) {
            System.out.println(value);
        }
    }
}
