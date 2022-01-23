package stringex.practice;

// equals : 두 개의 String에 값만을 비교해서 반환 true or false
// 대소문자도 비교
public class Test03 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        boolean equals = str1.equals(str2);
        System.out.println("equals: " + equals);
    }
}
