package ch05;

public class ArrayLengthExample {
    public static void main(String[] args){
        int[] scores = {84, 90, 96};

        int sum = 0;
        for(int i=0; i<scores.length; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length; //Array.length로 배열의 길이 산출
        System.out.println("평균 : " + avg);
    }
}
