package ch05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1, 자바 학습, 참조 타입 String을 학습합니다, Luz";

        //문자열 분리
        String[] tokens = board.split(", ");

        for(int i=0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}