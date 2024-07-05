package section05;

public class Ex0512 {
  public static void main(String[] args) {

    // do while문 (while (조건식)false 될때까지 함)
    do {
      System.out.println("최초한번 실행 후 조건식이 true면 반복");
    } while (false);

    int sum = 0;
    int i = 1;

    // 1이란 값을 sum에 누적
    do {
      sum += i;
      i++;
    } while (i <= 10);
    // }while(false);// false면 1만 출력됨

    System.out.println(sum);
  }
}
