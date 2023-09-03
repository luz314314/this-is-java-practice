package ch03;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2); //true
        boolean result2 = (num1 != num2); //false
        boolean result3 = (num1 <= num2); //true

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); //65 < 66 true

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4); //true

        String str1 = "JAVA";
        String str2 = "Java";
        boolean result6 = (str1.equals(str2)); //false
    }
}
