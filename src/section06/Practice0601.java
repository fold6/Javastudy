package section06;

import java.util.Scanner;

public class Practice0601 {

    public static void main(String[] args) {

        /*
         * 숫자를 입력하세요 (종료: 0): 1

         * 숫자를 입력하세요 (종료: 0): 2

         * 숫자를 입력하세요 (종료: 0): 3

         * 숫자를 입력하세요 (종료: 0): 4

         * 숫자를 입력하세요 (종료: 0): 5

         * 숫자를 입력하세요 (종료: 0): 0

         * 입력된 숫자들의 합: 15

         */

        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (종료: 0): ");
        number = scanner.nextInt();
        // while 문을 이용하여 보기와 같은 결과로 작동하도록 코드를 완성하시오!

        while (number != 0) {
            sum += number;
            System.out.print("숫자를 입력하세요 (종료: 0): ");
            number = scanner.nextInt();
        }

        System.out.println("입력된 숫자들의 합: " + sum);
        scanner.close();

    }

}