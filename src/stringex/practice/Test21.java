package stringex.practice;

// replaceFirst : 문자열에 지정한 문자 ""를 새로지정한 문자 ""로 바꿔서 출력
public class Test21 {
    public static void main(String[] args) {
        String str = "Aman";
        String replaceFirst = str.replaceFirst("A", "super");
        System.out.println("replaceFirst: " + replaceFirst);
    }
}
