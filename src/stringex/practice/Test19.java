package stringex.practice;

// format : 서식문자열을 이용해서 서식화된 문자열을 반환
public class Test19 {
    public static void main(String[] args) {
        int i = 123456789;
        // %d (=Integer Formatting)
        // % 바로 뒤에 , 를 붙이면 3자리 단위로 쉼표 생성
        String str = String.format("%,d", i);
        System.out.println("format: " + str);
    }
}
