package ch03;

public class ConditionalOperationExample {
    public static void main(String[] args){
        int val = 90;
        int grade = (val >= 90) ? 1 : ((val >= 80) ? 2 : 3);

        System.out.println(val + "점은 " + grade + "등급 입니다.");
    }
}
