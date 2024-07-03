package section03;

public class Ex0305 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        // 이항 - 산술 연산자
        System.out.println("num1 + num2 :" + (num1 + num2));
        System.out.println("num1 - num2 :" + (num1 - num2));
        System.out.println("num1 * num2 :" + (num1 * num2));
        System.out.println("num1 / num2 :" + (num1 / num2));
        //정수끼리 연산하려면 정수끼리 ()를 입력해야함 (아니면 문자열로 인식하여 12가 됨)
        System.out.println("num1 / num2 :" + ((double)num2));
        System.out.println("num1 % num2 :" + (num1 % num2));
    }
    
}
