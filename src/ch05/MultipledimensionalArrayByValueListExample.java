package ch05;

public class MultipledimensionalArrayByValueListExample {
    public static void main(String[] args){
        int[][] scores = {
                {80, 85, 90},
                {88, 98}
        };

        System.out.println("반의 수 : "+scores.length);
        System.out.println("첫 번째 반의 학생 수 : "+scores[0].length);
        System.out.println("두 번째 반의 학생 수 : "+scores[1].length);
    }
}
