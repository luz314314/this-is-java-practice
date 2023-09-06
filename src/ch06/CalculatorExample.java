package ch06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.powerOn();

        int result1 = calc.plus(5, 6);
        System.out.println("result 1 : " + result1);

        double result2 = calc.divide(10, 4);
        System.out.println("result 1 : " + result2);

        calc.powerOff();

        double rectArea = calc.areaRectangle(10);
        double rectArea2 = calc.areaRectangle(10, 20);
        System.out.println("정사각형 넓이 : " + rectArea);
        System.out.println("직사각형 넓이 : " + rectArea2);
    }
}