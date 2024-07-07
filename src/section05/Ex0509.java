package section05;

public class Ex0509 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 홀수인 경우 continue
            if (i % 2 != 0) {
                continue;
            }
            // 짝수인 경우이므로 출력
            if (i > 10) {
                break;
            }
            System.out.printf("%d ", i);
        }
    }
}
