package section06;

public class Practice0603 {
    public static void main(String[] args) {
        // 1부터 10까지 홀수의 합 :25
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.printf("합:%d", sum);
    }
}
