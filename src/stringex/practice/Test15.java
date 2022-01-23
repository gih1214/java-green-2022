package stringex.practice;

// compareTo : 두 개의 String을 앞에서부터 순사적으로 비교하다가 
// 틀린 부분이 있으면 비교하는 String에 캐릭터 값을 반환한다.
// 대소문자 구별
public class Test15 {
    public static void main(String[] args) {
        String str1 = "A"; // 65
        String str2 = "B"; // 66
        // 기준값 str1이 str2보다 크면 1
        // 기준값 str1이 str2보다 작으면 -1
        // 기준값 str1이 str2와 동일하면 0
        // 아스키값으로 크기 비교
        int compareTo = str1.compareTo(str2);
        if (compareTo > 0) {
            System.out.println(str1 + " > " + str2);
        } else if (compareTo == 0) {
            System.out.println(str1 + " = " + str2);
        } else {
            System.out.println(str1 + " < " + str2);
        }
    }
}
