package section07;

import java.util.Arrays;

public class Ex0706 {
    public static void main(String[] args) {
        //깊은복사
        
        int[] originalArray = {1,2,3,4,5};

        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

        copiedArray[0] = 100;

        System.out.println("originalArray:\t" + Arrays.toString(originalArray));
        System.out.println("copiedArray:\t" + Arrays.toString(copiedArray));
        
    }
}
