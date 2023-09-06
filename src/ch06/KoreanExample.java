package ch06;

public class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("김자바", "010101-3456789");

        System.out.println("국적 : " + k1.nation);
        System.out.println("이름 : " + k1.name);
        System.out.println("주민번호 : " + k1.ssn);

        Korean k2 = new Korean("이썬", "020202-4456789");

        System.out.println("국적 : " + k2.nation);
        System.out.println("이름 : " + k2.name);
        System.out.println("주민번호 : " + k2.ssn);
    }
}
