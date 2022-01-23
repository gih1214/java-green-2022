package stringex.practice;

// valueOf : 지정한 개체의 원시 값을 반환
// 원시 값은 변경 불가능한 값. 즉 읽기 전용 값이다.
public class Test14 {
    public static void main(String[] args) {
        int i = 12345;
        long l = 1L;
        char c = '1';
        System.out.println("valueOf: " + String.valueOf(i));
        System.out.println("valueOf: " + String.valueOf(l));
        System.out.println("valueOf: " + String.valueOf(c));
    }
}
