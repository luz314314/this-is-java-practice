package ch05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9403141234567";
        char gender = ssn.charAt(6);
        switch (gender){
            case '1':
            case '3':
                System.out.println("남성입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여성입니다.");
                break;
        }
    }
}
