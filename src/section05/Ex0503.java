package section05;

public class Ex0503 {
    public static void main(String[] args) {
        // 1~10 짝수 출력
        int number = 1;
        while (number <= 10) {
            // 10 이하 동안
            if (number % 2 == 0) {
                // 나누었을때 나머지가 0인것만 보여줌 (즉 짝수만 출력)
                System.out.printf("%d ", number);
            }
            number++;
            // 계속 수를 증가시킴
        }
    }
}
