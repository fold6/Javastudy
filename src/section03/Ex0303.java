package section03;

public class Ex0303 {
    public static void main(String[] args) {
        char a = 'a';

        // 문자는 증감 연산자 사용 가능
        System.out.println("a\t:" + a);
        System.out.println("(int) a\t:" + (int) a); //a의 아스키숫자 97
        System.out.println("a++ \t : " + a++); // 후위 연산함
        System.out.println("a \t : " + a); // 위의 후위연산 후라서 a 다음 문자인 b가 출력
        System.out.println("(int) a\t:" + (int) a); //int값으로 형변환을 하여, b의 아스키 코드 98이 나타남 
        
    }
    
}
