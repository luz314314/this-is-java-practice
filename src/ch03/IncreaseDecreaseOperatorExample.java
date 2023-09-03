package ch03;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println(x);     //12

        z = x++;
        System.out.println(z);     //12
        System.out.println(x);     //13

        z = ++x;
        System.out.println(z);     //14
        System.out.println(x);     //14

        z = ++x + y++;
        System.out.println(z);     //25
        System.out.println(x);     //15
        System.out.println(y);     //11
    }
}
