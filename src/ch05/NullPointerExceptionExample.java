package ch05;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 10;   //NullPointerException 번지가 할당되지 않았기 때문

        String str = null;
//        System.out.println("총 문자 수  : " + str.length()); //NullPointerException

        String name = "luz";
        name = null;
        //어떤 변수에서도 객체를 참조하지 않게 되기 때문에 프로그램에서 사용할 수 없는 객체가 됨
        //즉 힙 메모리에는 있지만, 번지를 모르기 대문에 사용할 수 없게 된다
        //자바는 이러한 객체를 쓰레기로 취급하고 가비지 컬렉터를 실행시켜 자동으로 제거한다 > 메모리 관리
        //자바는 코드를 이용해서 객체를 직접 제거하는 방법을 제공하지 않기 때문에, 참조를 없애는게 객체를 제거하는 유일한 방법이다

        String address = "Seoul";
        address = "Daejeon";
        //이렇게 새로운 값을 대입할 경우
        //"Seoul"에 해당하는 String객체는 쓰레기가 되어 가비지 컬렉터에 의해 제거된다
        //"Daejeon"이 대입되면, 다른 String 객체의 번지가 대입되고 이전의 번지는 잃게 된다
    }
}
