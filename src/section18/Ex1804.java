package section18;

import java.util.Scanner;

public class Ex1804 {
    public static void main(String[] args) {
        // Scanner : 입력값을 받게함 (scanner 누르고 ctrl + space)
        // 종류 : system.in / system.out / system.error
        Scanner scanner = new Scanner(System.in);

        //nextInt : 정수만 받는 메서드
        System.out.print("하나의 정수를 입력하세요: ");
        int intNum1 = scanner.nextInt();

        System.out.println("intNum1 : " + intNum1);
        scanner.close();

    }
}
