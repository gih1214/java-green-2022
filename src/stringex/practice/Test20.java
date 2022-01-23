package stringex.practice;

// matches : 지정한 정규 표현과 일치 하면 true로 반환 아니면 flase
public class Test20 {
    public static void main(String[] args) {
        int i = 123456;
        String str1 = String.format("%,d", i);
        String str2 = "123456";
        boolean matches = str1.matches(str2);
        System.out.println("matches: " + matches);
    }
}
