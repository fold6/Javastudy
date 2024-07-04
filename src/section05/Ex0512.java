package section05;

public class Ex0512 {
    public static void main(String[] args) {
      
    //do while문 (while (조건식)false 될때까지 함)
    do{
        System.out.println("최초 한번 실행후 조건식이 true면 반복");
      } while(false);
      
      int sum = 0;
      int i = 1;

      do {
        sum += i;
        i++;
        //sum에 i를 더하는데 i는 ++이라서 1씩 증가됨
      }while(i <= 10);
      //i가 10이하까지 i를 올려줌
    }

}
