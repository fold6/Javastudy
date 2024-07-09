package section07;

public class Practice0704 {
    public static void main(String[] args) {
        /* 
         * 배열의 최댓값 : 50
         * 배열의 최솟값 : 10
         */

         int[] numbers = {10, 20, 30, 40, 50};

         int max = numbers[0];
         int min = numbers[0];
         // 순회용으로 초기값을 설정함

         // for each
         for (int number : numbers){
            if (number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
         }
         System.out.println("배열의 최댓값:" + max);
         System.out.println("배열의 최솟값:" + min);

    }
    
}
