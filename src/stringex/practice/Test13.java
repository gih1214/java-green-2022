package stringex.practice;

// trim : 문자열에 공백을 없애준다.
public class Test13 {
    public static void main(String[] args) {
        String s = "     java java java     ";
        String v;
        v = s.trim();
        System.out.println("trim:" + v);
    }
}
