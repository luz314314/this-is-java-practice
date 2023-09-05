package ch05;

public class IndexOfContainsExample {
    public static void main(String[] args){
        String str = "자바 프로그래밍";

        int location = str.indexOf("프로그래밍");
        System.out.println(location); //3
        String substring = str.substring(location);
        System.out.println(substring); //프로그래밍

        int location2 = str.indexOf("자바");
        if(location2 != -1){
            System.out.println("자바와 관련 있는 문자열입니다.");
        } else {
            System.out.println("자바와 관련 없는 문자열입니다.");
        }

        boolean result = str.contains("자바");
        if(result){
            System.out.println("자바가 포함된 문자열입니다.");
        } else {
            System.out.println("자바가 포함되지 않은 문자열입니다.");
        }
    }
}
