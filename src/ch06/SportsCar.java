package ch06;

public class SportsCar {
    String model = "BMW";
    String color ="black";
    int speed;
    int maxSpeed = 200;
    boolean start = true;
    Tire tire = new Tire();
}

//한 소스 파일에서 여러개의 클래스 생성가능
//소스 파일명과 동일한 클래스만 공개 클래스로 선언 가능
class Tire {}