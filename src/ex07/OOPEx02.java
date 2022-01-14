package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor aaa = new Doctor();
        System.out.println(aaa.name);
        System.out.println(aaa.sal);
    }
}
