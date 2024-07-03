package section02;

public class Ex0205 {
    public static void main(String[] args) {
        //정수형
        int intNum = 100;
        System.out.println("intNum:" + intNum);

        long longNum = 100000;
        System.out.println("longNum:" + longNum);

        long longNum2 = 100000000000L;
        //21억이 넘어가므로 long이 담을수 없음, 무조건 L을 붙힘
        //L을 붙이지 않으면 컴파일러는 그 숫자를 int 타입으로 해석하려고 시도하다가 범위를 초과하는 경우 오류를 발생 (float에 f를 붙히는것도 같은 원리임)
        System.out.println("longNum2:" + longNum2);
    }
}
