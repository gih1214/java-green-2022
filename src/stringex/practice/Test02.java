package stringex.practice;

// endWith : 문자열 마지막에 지정한 문자가 있는지 판단 true or false
// 대소문자도 구별
public class Test02 {
    public static void main(String[] args) {
        String str = "test";
        boolean endsWith = str.endsWith("t");
        System.out.println("endsWith: " + endsWith);
    }
}
