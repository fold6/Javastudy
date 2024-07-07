package my_practice;

public class Dc_for_each {
      public static void main(String[] args) {
         //드림캐쳐 멤버를 배열로 표현
         String[] dcMem = {"지유","수아","시연","한동","다미","유현","가현"};

         System.out.println("드림캐쳐 멤버 수: " + dcMem.length +"명");
         for(String member : dcMem){
            System.out.printf("%s ",member);
         }

         
      }
}
