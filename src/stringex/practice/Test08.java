package stringex.practice;

// split : 지정한 문자로 문자열 나누기
// 배열로 반환
public class Test08 {
    public static void main(String[] args) {
        String str = "A:B:C:D:abcd";
        String[] split = str.split(":");
        System.out.println("split: " + split[1]);
    }
}
