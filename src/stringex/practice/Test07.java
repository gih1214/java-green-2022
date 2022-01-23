package stringex.practice;

// replace : 문자열에 지정한 문자 "" 를 새로 지정한 문자 "" 로 바꿔서 출력
public class Test07 {
    public static void main(String[] args) {
        String str = "A*B*C*D";
        String replace = str.replace("*", "-");
        System.out.println("replace: " + replace);
    }
}
