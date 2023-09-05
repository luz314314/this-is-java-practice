package ch05;

public class ReferenceVariableCompareExample {
    public static void main(String[] args){
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {1, 2, 3};
        arr3 = arr2;

        System.out.print(arr1 == arr2); //false 항목의 값은 같아도 저장된 메모리 번지가 다름
        System.out.print(arr2 == arr3); //true 메모리 번지가 같음 같은 배열을 참조
    }
}
