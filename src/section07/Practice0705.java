package section07;

import java.util.Scanner;

public class Practice0705 {
    public static void main(String[] args) {
        /*
         * 찾을 값을 입력하세요 : 70
         * 배열에 70 값이 존재하지 않습니다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("찾을 값을 입력하세요: ");
        int target = scanner.nextInt();

        int[] numbers = { 10, 20, 30, 40, 50 };
        boolean found = false;

        // 배열을 순회하면서 값을 찾음
        for (int number : numbers) {
            if (target == number) {
                found = true;
                break;  // 값을 찾으면 더 이상 순회할 필요가 없음
            }
        }

        // 찾은 결과에 따라 출력
        if (found) {
            System.out.println("배열에 " + target + " 값이 존재합니다.");
        } else {
            System.out.println("배열에 " + target + " 값이 존재하지 않습니다.");
        }
    }
}
