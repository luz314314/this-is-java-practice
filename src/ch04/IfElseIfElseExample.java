package ch04;

public class IfElseIfElseExample {
    public static void main(String[] args){
        int score = 77;

        if(score>=90){
            System.out.println("점수가 90~100점이므로 A등급입니다.");
        } else if(score>=80){
            System.out.println("점수가 80~89점이므로 B등급입니다.");
        } else if(score>=70){
            System.out.println("점수가 70~79점이므로 C등급입니다.");
        } else {
            System.out.println("점수가 70점 미만이므로 D등급입니다.");
        }
    }
}
