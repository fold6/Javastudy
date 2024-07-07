package my_practice;

public class Dc_for_each {
      public static void main(String[] args) {
         // 가계부에 저장된 지출 항목들을 배열로 표현
         String[] expenses = {"식비", "교통비", "문화생활", "의류", "교육비", "기타" ,""};
 
         // for each 문을 사용하여 각 지출 항목을 출력
         System.out.println("오늘의 지출 항목:");
         for (String expense : expenses) {
             System.out.println("- " + expense);
         }
         System.out.println("expenses.length\t: " + expenses.length); // 배열의 길이 출력
      }
}
