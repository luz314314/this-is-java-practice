package ch04;

public class BreakExample {
    public static void main(String[] args) {
        while(true){
            int num = (int)(Math.random() * 6) + 1;
            System.out.println(num);

            if(num == 6){
                System.out.println("6이 나왔으므로 종료합니다.");
                break;
            }
        }
    }
}