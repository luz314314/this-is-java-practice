package ch03;

public class OverflowUnderflowExample {
    public static void main(String[] args){
        byte value = 127;
        value++;
        System.out.println(value); // -128 오버플로우

        byte value2 = -128;
        value2--;
        System.out.println(value2); // 127 언더플로우
    }
}
