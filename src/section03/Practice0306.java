package section03;
public class Practice0306 {
  //check
    public static void main(String[] args) {
      int x = 2;
      int y = 5;
      char c = 'A';

      System.out.println((int) c);

      System.out.println(y >= 5 || x < 0 && x > 2); 
      // 1단계 : true || false && false
      // 2단계 : t || f (&&이 우선순위 높기때문에 먼저계산)
      // 3단계 : ||(or연산)은 true가 하나라도 있으면 t 이므로 결과:true; 

      //[논리연산자 참고]
      // && = 둘 다 t 일때 t
      // || = A와 B의 결과가 둘 다 f일때 f(하나라도 t면 true)
      // ^ = 서로 다를때 t


      
      System.out.println(y += 10 - x++); //15 - 2(후라서 3이아니라 2)

      System.out.println(!('A' <= c && c <= 'z')); //false
      
      //1단계 : a의 아스키는 65(c도 마찬가지) , z는 122임
      //2단계 : t && t  를 뒤집으면? false임

      System.out.println(++c);//'B'
      System.out.println(c+1);//67
      


    }
}
