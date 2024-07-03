package section03;

public class Eme1_upcasting {
    public static void main(String[] args) {
        int intNum = 1; // 정수형 변수 intNum을 선언하고 값 1을 할당합니다.
        double doubleNum; // double형 변수 doubleNum을 선언합니다. 초기값은 할당되지 않았습니다.

        doubleNum = (double)intNum; // intNum을 double형으로 형 변환하여 doubleNum에 할당합니다.
        System.out.println(doubleNum); // doubleNum의 값을 출력합니다.

        System.out.println("다시 형변환 하기");

        int intchange = (int)doubleNum; // 위의 더블넘을 다시 인트로 바꾼다
        System.out.println(intchange);

    }
}
