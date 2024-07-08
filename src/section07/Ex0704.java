package section07;

import java.util.Arrays;
import java.util.Collections;

public class Ex0704 {
    public static void main(String[] args) {
        // 배열 정렬하기(오름차순)
        int[] numbers = {30, 10, 50, 40};

        System.out.println("정렬 전:" + Arrays.toString(numbers));

        Arrays.sort(numbers);
        // sort 메서드를 사용하여 오름차순 정렬

        System.out.println("정렬 후:" + Arrays.toString(numbers));

        // wrapper 
        Integer[] integerNumbers = {30, 10, 50, 40};
        Arrays.sort(integerNumbers, Collections.reverseOrder());
        // 순서를 뒤집는 것
        System.out.println("integerNumbers 정렬 후:" + Arrays.toString(integerNumbers));
    }
}
