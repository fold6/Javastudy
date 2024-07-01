package section02;

public class DataType {
    public static void main(String[] args) {
        //[정수]
        int age = 10;
        System.out.println("제 나이는 " + age + "세 입니다.");
        age = 2147483647 + 1000;
        System.out.println("제 나이는 " + age + "세 입니다.");
        //이렇게 int 타입이 표현할 수 있는 범위가 넘어가면 이상한 값이 출력됨
        //때문에 L(or 소문자지만 대문자권장)자를 붙히면 L앞에 있는 정수값은 Long타입이라고 바꿔짐

        long num = 2147483647L + 1000L;
        //타입의 리터럴(L)을 사용하여 long 타입으로 명시한것 (형변환 아님)
        System.out.println("제 나이는 " + num + "세 입니다.");

        //[실수]
        float pi = 3.14f; // float은 값(리터럴:literal)에 f를 추가
        System.out.println("float : " + pi);

        double height = 185.9;
        System.out.println("double : " + height);

        float overflow = 3.141569845f; // 넘치게 출력시 예시: 소숫점 7자리 까지만 표현되는게 float
        System.out.println("float_overflow : " + overflow);

        double overflowDouble = 3.14156984576768667; // 넘치게 출력시 예시: 정밀히 모든 소숫점이 표기되는게 double
        System.out.println("float_overflow : " + overflowDouble);
        
        // 8진수
        int octal = 023; //23은 10진수 인데 0을 붙히면 8진수가 됨
        System.out.println("8진수 23 :" + octal);

        // 16진수
        int hex = 0x23; //
        System.out.println("16진수 23 :" + hex);

        // [문자](char)
        char c = 'c';
        System.out.println(c);
        c = 99;// 아스키 코드값을 출력 , 즉 99는  아스키 코드상의 'c'
        System.out.println(c);

        //[불리언](boolean)
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);
        b = 1 > 2;
        System.out.println(b); // '1과 2를 비교시 1이 더크다' = 틀림(false)출력
        b = 1 < 2;
        System.out.println(b); // '1과 2를 비교시 2가 더크다' = 맞음(true)출력
        b = 1 <= 2;
        System.out.println(b); // '2가 1보다 크거나 같다=이상이다' = 맞음(true)출력
        
    }
}
