package section07;

import java.util.Arrays;

public class Ex0708 {
    public static void main(String[] args) {
        // 다차원 배열에서는 깊은 복사가 안됨 (반복문 돌려서 해야함)
        int[][] arrs = new int[3][4];
        int index = 0;
        for (int[] arr : arrs) {
            System.out.println("index:" + index + " : " + Arrays.toString(arr));
            index++;
        }

        System.out.println();
        int[][] copiedArrs = Arrays.copyOf(arrs, arrs.length);
        // 0번인덱스의 0번을 100으로 변경
        arrs[0][0] = 100;

        System.out.println();
        System.out.println("다차원 배열 깊은 복사시 주의!");
        index = 0;
        for (int[] arr : arrs) {
            System.out.println("index:" + index + " : " + Arrays.toString(arr));
            index++;
        }

        System.out.println();
        index = 0;
        for (int[] arr : copiedArrs) {
            System.out.println("index:" + index + " : " + Arrays.toString(arr));
            index++;
        }

    }

}
