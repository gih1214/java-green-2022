package stringex.practice;

// lastindexOf : 문자열에 지정한 문자가 마지막 몇번째에 있는지 int를 반환
// 프로그래밍의 위치값은 0부터 시작
public class Test05 {
    public static void main(String[] args) {
        String str = "AdnroidApp";
        int lastIndexOf = str.lastIndexOf("A");
        System.out.println("lastIndexOf:" + lastIndexOf);
    }
}
