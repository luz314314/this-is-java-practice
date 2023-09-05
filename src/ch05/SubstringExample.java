package ch05;

public class SubstringExample {
    public static void main(String[] args){
        String ssn = "940314-1234567";

        String firstNum = ssn.substring(0, 6); //0번부터 6번 인덱스 앞까지
        String secondNum = ssn.substring(7); //7번 인덱스부터 끝까지

        System.out.println(firstNum); //940314
        System.out.println(secondNum); //1234567
    }
}
