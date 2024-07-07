package section05;

public class Ex0502 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            if (number % 2 != 0) {
                System.out.printf("%d ", number);
            }
            number++;
        }
        System.out.println("반복문 종료");
    }
}
