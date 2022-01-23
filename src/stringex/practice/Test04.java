package stringex.practice;

// indexOf : 지정한 문자가 몇번째 문자열에 있는지 반환
// 프로그래밍의 위치값은 0부터 시작
public class Test04 {
    public static void main(String[] args) {
        String str = "abcdef";
        int indexOf = str.indexOf("d");
        System.out.println("indexOf: " + indexOf);
    }
}
