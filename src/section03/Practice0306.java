package section03;
public class Practice0306 {
    public static void main(String[] args) {
      int x = 2;
      int y = 5;
      char c = 'A';

      // System.out.println((int) c);

      System.out.println(y >= 5 || x < 0 && x > 2); 
      // true || false && false
      // || = A와 B의 결과가 둘 다 f일때 f
      // && = 둘 다 t 일때 t
      // 우선순위 감안하고 봐야하므로 &&을 먼저 연산함 즉, f가 됨 -> true || false 만 남고, ||는 둘 다 f일때 f이므로 결과는 T

      
      System.out.println(y += 10 - x++); //15 - 2(후라서 3이아니라 2)

      System.out.println(!('A' <= c && c <= 'z')); //false
      // 이것들 바로 읽는 법을 알아야 할듯

      System.out.println(++c);//'B'
      System.out.println(c+1);//67
      


    }
}
