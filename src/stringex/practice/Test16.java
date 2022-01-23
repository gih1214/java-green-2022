package stringex.practice;

// contains : 두 개의 String을 비교해서 비교대상 String 포함하고 있으면 true
// 다르면 false를 반환
public class Test16 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "c";
        boolean contains = str1.contains(str2);
        System.out.println("contains: " + contains);
    }
}
