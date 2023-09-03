package ch03;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int val = 'A';
//        int val = 'a';
//        int val = '5';

        if((65<=val) && (val<=90)){
            System.out.println("대문자입니다.");
        }

        if((97<=val) && (val<=122)){
            System.out.println("소문자입니다.");
        }

        if((48<=val) && (val<=57)){
            System.out.println("0-9 사이의 숫자입니다.");
        }

        int val2 = 6;
//        int val2 = 7;

        if((val2%2==0) | (val2%3==0)) {
            System.out.println("2또는 3의 배수입니다.");
        } else {
            System.out.println("2또는 3의 배수가 아닙니다.");
        }
    }
}