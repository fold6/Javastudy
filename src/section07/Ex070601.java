package section07;

import java.util.Arrays;
//깊은복사
public class Ex070601 {
    public static void main(String[] args) {
        //깊은복사
        
        int[] originalArray = {1,2,3,4,5};

        int[] copiedArray = new int[3];
        //2,3,4만 복사하고 싶을때는? 깊은복사를 씀
        System.arraycopy(originalArray, 1, copiedArray, 0, 3);
        //몇번째 인덱스부터 카피할것인지 적기,카피대상이 되는 객체를 적기,copiedArray에서 몇번째부터 카피할건지 넣기, 얼만큼의 길이만큼 카피할것인가

        
        //깊은 복사가 잘됏는지는 아래걸 바꾸면 확인가능 (깊은은 각각 바뀜)
        // copiedArray[0] = 100;

        System.out.println("originalArray:\t" + Arrays.toString(originalArray));
        System.out.println("copiedArray:\t" + Arrays.toString(copiedArray));
        
    }
}
