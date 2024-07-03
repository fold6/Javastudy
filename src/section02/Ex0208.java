package section02;

public class Ex0208 {
    public static void main(String[] args) {
        int intNum1 = 1;
        byte byteNum1 = (byte) intNum1; // byte가 int보다 작으므로 byte로 강제 형변환
        System.out.println(intNum1);

        /* overflow 예시 */
        int intNum128 = 128;
        byte byteNum128 = (byte) intNum128;
        /*  byte는 127까지만 담을 수 있기 때문에 출력이 -128으로 나옴
         즉, 강제 형변환시 데이터 손실이 발생할 수 있으므로
         타입별 표현범위를 알고 있어야 함
         [강제 형변환 주의!]
        - 데이터 손실 발생
        -소숫점 이하 자릴수 손실
        -값의 범위초과
        -예상치 못한 논리적 오류 */
        System.out.println(byteNum128);

    }

}
