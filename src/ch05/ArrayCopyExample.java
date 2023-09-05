package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] strArray = {"Java", "C", "Python"};
        String[] newStrArray = new String[5];

        System.arraycopy(strArray, 0, newStrArray, 0, strArray.length);

        for(int i=0; i<newStrArray.length; i++){
            System.out.println(newStrArray[i]); //Java, C, Python, null, null
        }
    }
    }
