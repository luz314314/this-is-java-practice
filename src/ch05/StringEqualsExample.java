package ch05;

public class StringEqualsExample {
    public static void main(String[] args){
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1 == str2); //true //문자열 리터럴이 동일하면 같은 String 객체를 공유
        System.out.println(str2 == str3); //false //문자열 리터럴과 new 연산자로 생선한 String은 다른 객체를 참조
        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true 내부 문자열만을 비교할 경우는 같음
    }
}
