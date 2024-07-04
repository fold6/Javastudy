package section03;
public class Practice0305 {
    public static void main(String[] args) {
      int num = 10;
      //check
      
      // 복합 대입 연산자 사용
      // +=, -=, *=, /=, %=

      //더하기
      num += 5;
      // a = a + b와 동일 즉, 10 + 5 = 15
      System.out.println("결과는 15\t:" + num );

      //빼기
      num -= 3;
      System.out.println("결과는 12\t:" + num);

      //곱하기
      num *= 2;
      System.out.println("결과는 24\t:" + num);

      //나눗셈
      num /= 4;
      System.out.println("결과는 6\t\t:" + num);

      //나머지
      num %= 3;
      System.out.println("결과는 0\t\t:" + num);
    }
}
