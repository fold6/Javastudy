package section03;

public class FloatingPoint {
    public static void main(String[] args) {
        // 부동소수점 오차
        double doubleNum1 = 0.1;
        doubleNum1 += 0.1;
        doubleNum1 += 0.1;
        System.out.println(doubleNum1); //0.30000000000000004
    }

}
