package ch05;

public class MultipledimensionalArrayByNewExample {
    public static void main(String[] args){
        //배열의 길이가 다를 경우
        String[][] names = new String[2][];
        names[0] = new String[3];
        names[1] = new String[2];

        //배열 항목 값 변경
        names[0][0] = "Java";
        names[0][1] = "Java";
        names[0][2] = "Python";
        names[1][0] = "C";
        names[1][1] = new String("Java");
    }
}
