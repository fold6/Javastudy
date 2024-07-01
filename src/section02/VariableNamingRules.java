package section02;

public class VariableNamingRules {
    public static void main(String[] args) {
        // [변수명 작명 방식 - 불가능 예시]
        // int 1a = 1;
        //변수명은 숫자로 시작불가

        // int int = 1;
        // 자바에서 이미 사용중인 키워드(예약어)는 사용불가

        int Int = 0;
        // 첫자를 대문자로 바꾸면 사용가능(대소문자 구분)

        // int a! = 1;
        int _a = 1;
        int _a$b = 2;
        // 특수문자는 사용불가 (_와 $ 제외)

        System.out.println(Int);
        System.out.println(_a);
        System.out.println(_a$b);
    }
}
