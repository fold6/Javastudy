package my_practice;

public class Dc_for_continue {
   public static void main(String[] args) {

      for (int i = 1; i <= 7; i++) {
         if(i % 2 != 0){
            //홀수라면 (참이면= 1,3,5,7,9)  continue; 문이 실행되어 해당 반복에서 루프의 처음으로 돌아가게 됨 (계속 처음으로 돌아가므로 결과를 볼 수 없음) = 홀수가 아닌 짝수가 아래 sout으로 나옴(쉽게 말해, 조건에 continue가 있으면 그 조건에 해당되는건 걸러져서 못본다고 생각하면 됨)
            continue;
         }
         System.out.printf("%d ",i);
      }

   }
}
