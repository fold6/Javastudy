package section05;
public class Ex0504 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            number++;
            if (number % 2 != 0) {
                //!를 썼으니까 짝수가 아닌,number가 홀수 인 경우 !참이라고 봄!
                // 1,3,4,5,7,9는 참이지만 continue; 때문에 결과가 건너뛰어지므로 짝수들이 나옴
                continue;
                //  continue란 : for, while, do-while 반복문과 함께 사용
                // 조건이 참이면 반복문 블록 내의 코드를 실행하는 코드 
            }
            System.out.printf("%d ", number);
            // 건너뛰었으니까 짝수일 때만 System.out.printf("%d ", number);가 실행
        }
    }
}
