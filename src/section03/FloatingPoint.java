package section03;

import java.math.BigDecimal;

public class FloatingPoint {
    public static void main(String[] args) {
        // 부동 소수점 오차 : 컴퓨터가 실수를 표현하고 계산하는 과정에서 발생하는 작은 오차
        double doubleNum1 = 0.1;
        doubleNum1 += 0.1;
        doubleNum1 += 0.1;
        System.out.println(doubleNum1); //0.30000000000000004

        // 부동 소수점 오차를 해결하기 위해 BigDecimal을 사용함
        // : 정확한 숫자 표현과 연산이 가능해져, 부동 소수점 오차 문제를 효과적으로 해결
        BigDecimal bdNum1 = new BigDecimal("0.1");
        BigDecimal bdNum2 = new BigDecimal("0.1");
        BigDecimal bdNum3 = new BigDecimal("0.1");
        System.out.println(bdNum1.add(bdNum2).add(bdNum3));
        // bdnum1 과 2를 더하고 3도 더한다 = 0.3으로 잘 나옴.  (찍고 더하는걸 메서드 체이닝 이라고함)

        // !주의!
        bdNum1 = new BigDecimal(0.1);
        bdNum2 = new BigDecimal(0.1);
        bdNum3 = new BigDecimal(0.1);
        System.out.println(bdNum1.add(bdNum2).add(bdNum3));
        //결과 : 0.312421414214! !주의! 인수 val 에 꼭 문자열을 넣으면 안되고 숫자로 넣어야함

    }

}
