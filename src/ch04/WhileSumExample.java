package ch04;

public class WhileSumExample {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;

        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1부터 100까지의 합은 " + sum + " 입니다.");
    }
}
