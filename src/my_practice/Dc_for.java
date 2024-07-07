package my_practice;

public class Dc_for {
   public static void main(String[] args) {

      /* 짝수출력 */
      System.out.println("\n짝수---");
      for (int i = 1; i <= 7; i++) {
         if (i % 2 == 0) {
            System.out.printf("%d ", i);
         }
      }

      /* 홀수출력 */
      System.out.println("\n\n홀수---");
      for (int i = 1; i <= 7; i++) {
         if (i % 2 == 1) {
            System.out.printf("%d ", i);
         }
      }

   }
}
