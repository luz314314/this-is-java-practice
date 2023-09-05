package ch05;

public class MultipledimensionalArrayByNewExample {
    public static void main(String[] args){
        int[][] scores = new int[2][3]; //항목들은 null로 초기화

        //배열의 길이가 다를 경우
        String[][] names = new String[2][];
        names[0] = new String[3];
        names[1] = new String[2];

        names[0][0] = "Java";
        names[0][1] = "Java";
        names[0][2] = "Python";
        names[1][0] = "C";
        names[1][1] = new String("Java");

        System.out.println(names[0][0] == names[0][1]); //true 리터럴이 같아서 같은 객체를 참조
        System.out.println(names[0][0] == names[1][1]); //false new 연산자로 생성하여 다른 객체를 참조
        System.out.println(names[0][0].equals(names[1][1])); //true 문자열은 동일
    }
}
