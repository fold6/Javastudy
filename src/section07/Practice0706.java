package section07;

public class Practice0706 {
    public static void main(String[] args) {
     /* 1. 3x3 크기의 2차원 배열을 선언하고 다음 값을 할당 하시오
      * 
      123
      456
      789
      */

      int[][] arrs = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
      };

      System.out.println();
      /* 2. for 문을 이용해 배열의 모든 요소를 출력하는 프로그램을 작성하시오 */
      for (int i = 0; i < arrs.length; i++) {
          for (int j = 0; j < arrs[i].length; j++) {
              System.out.print(arrs[i][j] + " ");
          }
          System.out.println();
        }

        System.out.println();
          for(int[] arr:arrs){
            for (int number: arr){
                System.out.print(number + " ");
            }
            System.out.println();
          }
      }

}
