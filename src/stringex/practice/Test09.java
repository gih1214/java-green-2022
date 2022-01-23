package stringex.practice;

// substring : 문자열에 지정한 범위에 속하는 문자열 반환
// 시작범위의 값은 포함, 끝나는 범위의 값은 포함하지 않음.
public class Test09 {
    public static void main(String[] args) {
        String str = "ABCDEF";
        String substring = str.substring(0, 2);
        System.out.println("substring: " + substring);
    }
}
