package section06;

import java.util.Scanner;

public class Practice0606_1 {
    public static void main(String[] args) {
        int sum = 0;
        int start;
        int end;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("시작하는 숫자와 끝 숫자를 입력하세요 (스페이스로 구분)");
        start = scanner.nextInt();
        end = scanner.nextInt();

        System.out.println("홀수는 1, 짝수는 2를 입력하세요: ");
        number = scanner.nextInt();
        if (number == 1) {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }

        String isOdd = number == 1 ? "홀수" : "짝수";
        System.out.printf("%d 부터 %d 까지 %s의 합:%d\n", start, end, isOdd, sum);
        scanner.close();
    }
}
