package ch06;

public class SportsCarExample {
    public static void main(String[] args){
        SportsCar car1 = new SportsCar();
        System.out.println("car1 변수가 SportsCar 객체를 참조합니다.");

        SportsCar car2 = new SportsCar();
        System.out.println("car2 변수가 또 다른 SportsCar 객체를 참조합니다.");

        System.out.println("모델명 : " + car1.model);
        System.out.println("색상 : " + car1.color);
        System.out.println("시동여부 : " + car1.start);
        System.out.println("현재속도 : " + car1.speed);

        car1.speed = 100;
        System.out.println("수정된 속도 : " + car1.speed);
    }
}
