package ch05;

public class ArrayCopyByForExample {
    public static void main(String[] args){
        int[] intArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        for(int i=0; i<intArray.length; i++){
            newIntArray[i] = intArray[i];
        }

        for(int i=0; i<newIntArray.length; i++){
            System.out.println(newIntArray[i]); //1, 2, 3, 0, 0
        }
    }
}
