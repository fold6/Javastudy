package section05;
//check
public class Ex0504 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            number++;
            if (number % 2 != 0) {
                //논리 부정으로 홀수로 변경
                continue;
                // continue; 이하의 코드는 절대사용하지 않는 용도
            }
            System.out.printf("%d ", number);
            // 건너뛰었으니까 짝수일 때만 System.out.printf("%d ", number);가 실행
        }
    }
}
