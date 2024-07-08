package section07;

import java.util.Arrays;

public class Ex0707 {
    public static void main(String[] args) {
        //다차원배열
        int[][] arrs = new int[3][]; // 빈 배열의 길이는 3개 (2중배열로하면, 배열객체라서 null뜸)

        //[[0,0], [0,0], [0,0]]
        //0번 index의 1번index를 2로 바꾸면-
        // arrs[0][1]=2;
        // //2번 i의 3번i를 30으로 바꾸면-
        // arrs[2][0]=30;
        
        //인덱스 별 배열의 길이[]와 값{} 넣을수 있음
        arrs[0] = new int []{0,1};
        arrs[1] = new int []{2,3,4};
        arrs[2] = new int []{5,6,7,8};


        int index = 0;
        for(int[] arr: arrs){
            System.out.println("index:" + index + " : " + Arrays.toString(arr));
            index++;
        }
        // System.out.println(Arrays.toString(arr)); //000 으로 3개나옴


    }
}
