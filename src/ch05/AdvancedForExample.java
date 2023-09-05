package ch05;

public class AdvancedForExample {
    public static void main(String[] args){
        int[] scores = {70, 80, 90, 85, 100};
        int sum = 0;

        for(int score : scores){
            sum += score;
        }
        System.out.println("총점 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
