package section07;
import java.util.Arrays;

public class Ex0702 {

    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] oddArrObject; 
        oddArrObject = new int[] {1, 3, 5, 7, 9};

        // 배열을 문자열로 변환하여 출력
        System.out.println(Arrays.toString(oddArrObject));

        // 길이가 5인 정수형 배열 선언 및 초기화
        int[] intArr = new int[5];
        // 배열의 초기 상태를 출력 (배열 요소가 모두 0으로 초기화됨)
        System.out.println("before - Arrays.toString(intArr)\t :" + Arrays.toString(intArr));

        // 배열의 각 요소에 값을 할당
        intArr[0] = 1;
        intArr[1] = 1;
        intArr[2] = 1;
        intArr[3] = 1;
        intArr[4] = 1;
        // 값이 할당된 배열을 출력
        System.out.println("after - Arrays.toString(intArr)\t\t :" + Arrays.toString(intArr));

        // 길이가 5인 문자열 배열 선언 (주석 처리된 부분)
        // String[] strArr = new String[5];
        // 배열의 초기 상태를 출력 (배열 요소가 모두 null로 초기화됨)
        // System.out.println(Arrays.toString(strArr));
    }

}
