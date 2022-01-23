package stringex.practice;

// startWith : 문자열이 지정한 문자로 시작하는지 판단 true or false
// 대소문자도 구별
public class Test01 {
    public static void main(String[] args) {
        String str = "apple";
        boolean startsWith = str.startsWith("a");
        System.out.println("startsWith: " + startsWith);
    }
}
